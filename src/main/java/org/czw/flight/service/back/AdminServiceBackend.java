package org.czw.flight.service.back;

import org.czw.flight.vo.Admin;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/13 15:02
 */
public interface AdminServiceBackend {
    Admin showAdmin(String username);

//    boolean updateByLastLoginTime(Map<String, Object> params);

    List<String> selectPermissionByUsername(String username);
    Map<String, Object> listAuthByAdmin(String username);

    // modified
    boolean add(Admin vo, Set<Integer> rid);
    List<Admin> list();

    boolean update(Admin adminVo);
}
