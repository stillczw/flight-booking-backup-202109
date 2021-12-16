package org.czw.flight.dao;

import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/13 17:29
 */
public interface IPermissionDao {
    @Select("SELECT permission from permission WHERE permission_id IN(SELECT permission_id FROM role_permission WHERE role_id IN (SELECT role_id FROM admin_role WHERE admin_id = #{username}))")
    public Set<String> findPermissionByAdmin(String username);

}
