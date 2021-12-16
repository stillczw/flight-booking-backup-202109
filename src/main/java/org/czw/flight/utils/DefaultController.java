package org.czw.flight.utils;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/13 20:04
 */

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * <li>此类负责处理公共业务</li>
 */
@Component
public abstract class DefaultController {

    /**
     * <li>创建文件名称</li>
     *
     * @param file 取得文件类型，后缀
     * @return 返回新的文件名称
     */
    public String createFileName(MultipartFile file) {
        if (file.isEmpty()) { // 当前没文件上传
            return "photo.jpg";
        } else { // 有上传文件
            return FileUploadUtils.createFileName(file.getContentType());
        }
    }

    /**
     * <li>文件上传</li>
     *
     * @param file     表示要执行上传的文件
     * @param fileName 文件名称
     * @param request
     * @return
     */
    public boolean saveFile(MultipartFile file, String fileName, HttpServletRequest request) {
        // 判断是否有文件上传
        if (!file.isEmpty()) {
            String filePath = request.getServletContext().getRealPath(this.getFilePath() + fileName);
            try {
                return FileUploadUtils.saveFile(file.getInputStream(), new File(filePath));
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * <li>删除磁盘文件</li>
     *
     * @param fileName
     * @param file
     * @param request
     * @return
     */
    public boolean deleteFile(String fileName, File file, HttpServletRequest request) {
        if (file.exists()) { // 判断文件存在
            String filePath = request.getServletContext().getRealPath(this.getFilePath() + fileName);
            return FileUploadUtils.deleteFile(filePath);
        } else {
            return false;
        }
    }

    /**
     * 使用UUID设置ID内容
     * @return 返回新的ID信息
     */
    public String getId() {
        return UUID.randomUUID().toString().replace("-", "").substring(1, 8);
    }

    /**
     * 编写文件保存目录
     * @return
     */
    public abstract String getFilePath();

    /**
     * <li>日期转换方法</li>
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) { // 日期转换器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(
                sdf, true));
    }
    /**
     * <li>print content</li>
     * @param msg successful, fail or other messages
     * @param response
     */
    public void print(Object msg, HttpServletResponse response) {
        try {
            response.setCharacterEncoding("UTF-8");
            response.getWriter().print(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

