package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.czw.flight.vo.Admin;

import java.util.List;
import java.util.Map;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/13 14:54
 */
public interface IAdminDao {

    @Select("SELECT username, login_id, `name`, password, `type`, status, last_login_time, photo FROM admin WHERE username = #{username} ")
    public Admin findById(String adminId);

    @Update("UPDATE admin SET last_login_time = #{lastLoginTime} WHERE username = #{username}")
    public boolean updateByLastLoginTime(Map<String, Object> params);

    // to be modified
    @Insert("INSERT INTO admin(username, password,name,photo,loginId,type,status) VALUES(#{username}, #{password},#{name},#{photo},#{loginId},#{type},#{status})")
    public boolean doCreate(Admin adminVo);

    @Select("SELECT username, password,name,photo,loginId,type,status,lastLoginTime FROM admin")
    public List<Admin> findAll();
    @Update("UPDATE admin SET password=#{password},photo=#{photo},name=#{name} WHERE username=#{admin_id}")
    public boolean doUpdate(Map<String, Object> map);
}
