package org.czw.flight.service.back;

import org.czw.flight.dao.IRoleDao;
import org.czw.flight.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhiwei_CHEN
 * @date 2021/12/05 19:06
 */
@Service
public class RoleServiceBackendImpl implements RoleServiceBackend {
    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> list() {
        return this.roleDao.findAll();
    }
}
