package org.czw.flight.utils;

import java.io.*;
import java.util.UUID;

public class FileUploadUtils {
    /**
     * <li>创建文件名称</li>
     *
     * @param mime 取得文件后缀
     * @return 返回新名称 + 后缀
     */
    public static String createFileName(String mime) {
        return UUID.randomUUID().toString().replace("-", "").substring(1, 8) + "." + mime.split("/")[1];
    }

    /**
     * <li>真实图片保存</li>
     *
     * @param inputStream 文件输入流
     * @param destFile    文件保存磁盘
     */
    public static boolean saveFile(InputStream inputStream, File destFile) {
        boolean flag = false; // 定义标志位
        if (!destFile.getParentFile().exists()) { // 判断父路径不存在
            // 创建父路径
            destFile.getParentFile().mkdirs();
        }
        OutputStream out = null;
        try {
            out = new FileOutputStream(destFile);
            byte data[] = new byte[1024];
            int temp = 0;
            while ((temp = inputStream.read(data)) != -1) {
                out.write(data, 0, temp);
            }
            flag = true; // 文件写入成功
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    /**
     * <li>删除文件</li>
     * @param filePath 文件路径
     */
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) { // 文件存在
            // 执行删除文件
            return file.delete();
        }
        return false;
    }
}
