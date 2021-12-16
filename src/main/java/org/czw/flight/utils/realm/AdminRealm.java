package org.czw.flight.utils.realm;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/15 15:16
 */

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.czw.flight.service.back.AdminServiceBackend;
import org.czw.flight.utils.md5.Md5Utils;
import org.czw.flight.vo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;


@Component
public class AdminRealm extends AuthorizingRealm {

    private Logger log = Logger.getLogger(String.valueOf(AdminRealm.class));

    @Autowired
    private AdminServiceBackend adminServiceBackend;
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        log.info("======LoginAuthentication======");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        /*String username = token.getUsername();
        CskaoyanmallAdminExample cskaoyanmallAdminExample=new CskaoyanmallAdminExample();
        cskaoyanmallAdminExample.createCriteria().andUsernameEqualTo(username);
        List<CskaoyanmallAdmin>cskaoyanmallAdminList=adminMapper.selectByExample(cskaoyanmallAdminExample);
        CskaoyanmallAdmin admin=cskaoyanmallAdminList.get(0);*/


        // get username
        String username = (String) token.getPrincipal();
        try {
            Admin adminVO = this.adminServiceBackend.showAdmin(username);
            if (adminVO == null) {
                throw new UnknownAccountException("Invalid user!");
            } else {
                // get password
                // String password =adminVO.getPassword();
                String password = new String((char[]) token.getCredentials());
                // encrypt the password
                System.out.println(Md5Utils.getMd5(password, "2590312"));
                if (adminVO.getPassword().equals(Md5Utils.getMd5(password, "2590312"))) {
                    SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, this.getName());
                    SecurityUtils.getSubject().getSession().setAttribute("admin", adminVO);
                    return authenticationInfo;
                } else {
                    throw new IncorrectCredentialsException("Wrong password!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
//        String password =admin.getPassword();
//        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, this.getName());
//        return authenticationInfo;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        /*//授权
        //List<String> permissions = adminMapper.selectPermissionByUsername(username);
        CskaoyanmallUserExample userExample = new CskaoyanmallUserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<CskaoyanmallUser> users = userMapper.selectByExample(userExample);
        CskaoyanmallUser credential =  users.size() >= 1?users.get(0):null;
        assert credential != null;
        Byte userLevel = credential.getUserLevel();
        String permission = String.valueOf(userLevel);*/

        log.info("======RoleAuthentication======");

        // get the username
        String username = (String) principalCollection.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Map<String, Object> map = null;

        try {
            map = this.adminServiceBackend.listAuthByAdmin(username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // authorizationInfo.addStringPermission(permission);
        authorizationInfo.setRoles((Set<String>) map.get("allRoles"));
        authorizationInfo.setStringPermissions((Set<String>) map.get("allPermissions"));

        return authorizationInfo;
    }


}

