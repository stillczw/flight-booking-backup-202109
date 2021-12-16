package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.czw.flight.model.Role;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/13 17:22
 */
public interface IRoleDao {
    @Select("SELECT title FROM role WHERE role_id IN(SELECT role_id FROM admin_role WHERE admin_id = #{username})")
    Set<String> findRoleByAdmin(String username);

    @Insert("INSERT INTO admin_role(role_id,admin_id)VALUES(#{role_id},#{admin_id})")
    public boolean doCreateByRole(Map<String,Object> params);
    @Select("SELECT role_id,title,is_deleted FROM role")
    public List<Role> findAll();

}
