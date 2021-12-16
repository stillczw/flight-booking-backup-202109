package org.czw.flight.service.back;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.dao.IAdminDao;
import org.czw.flight.dao.IPermissionDao;
import org.czw.flight.dao.IRoleDao;
import org.czw.flight.mapper.AdminMapper;
import org.czw.flight.mapper.AdminRoleMapper;
import org.czw.flight.mapper.PermissionMapper;
import org.czw.flight.mapper.RoleMapper;
import org.czw.flight.vo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/13 15:04
 */
@Service
public class AdminServiceBackendImpl implements AdminServiceBackend {
    @Autowired
    IAdminDao adminDao;
    @Autowired
    IPermissionDao permissionDao;
    @Autowired
    IRoleDao roleDao;

    /*@Autowired
    AdminMapper adminMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    AdminRoleMapper adminRoleMapper;
    @Autowired
    PermissionMapper permissionMapper;*/

    @Override
    public Admin showAdmin(String username) {
        Admin admin = this.adminDao.findById(username);
        if (admin != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("username", username);
            map.put("last_login_time", new Timestamp(new Date().getTime()));
            this.adminDao.updateByLastLoginTime(map);
            return admin;
        }
        return null;
    }

    /*@Override
    public boolean updateByLastLoginTime(Map<String, Object> params) {
        return false;
    }*/

    @Override
    public List<String> selectPermissionByUsername(String username) {
        return null;
    }

    @Override
    public Map<String, Object> listAuthByAdmin(String username) {
        /*RoleExample roleExample = new RoleExample();
        PermissionExample permissionExample = new PermissionExample();
        AdminRoleExample adminRoleExample = new AdminRoleExample();
        AdminRoleExample.Criteria adminRoleCriteria = adminRoleExample.createCriteria();
        adminRoleCriteria.andAdminIdEqualTo(username);
        List<AdminRole> adminRoles = adminRoleMapper.selectByExample(adminRoleExample);
        // get the role_id from admin_role table by username/admin_id*/


        HashMap<String, Object> map = new HashMap<>();
        // according to the authorization method of AdminRealm
        map.put("allRoles", roleDao.findRoleByAdmin(username));
        map.put("allPermissions", permissionDao.findPermissionByAdmin(username));
        return map;
    }

    @Override
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("admin:add")
    public boolean add(Admin adminVo, Set<Integer> rid) {
        if (this.adminDao.findById(adminVo.getUsername()) == null) {
            adminVo.setStatus(1);
            adminVo.setType(2); // super admins can add general admins
            adminVo.setPhoto("photo.jpg");
            if (this.adminDao.doCreate(adminVo)) {
                Iterator<Integer> iter = rid.iterator();
                while (iter.hasNext()) {
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("admin_id", adminVo.getUsername());
                    map.put("role_id", iter.next());
                    this.roleDao.doCreateByRole(map);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("admin:list")
    public List<Admin> list() {
        return this.adminDao.findAll();
    }

    @Override
    public boolean update(Admin adminVo) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", adminVo.getUsername());
        map.put("name", adminVo.getName());
        map.put("photo", adminVo.getPhoto());
        map.put("password", adminVo.getPassword());
        return this.adminDao.doUpdate(map);
    }

}
