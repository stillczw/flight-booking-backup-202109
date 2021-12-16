package org.czw.flight.service.back;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.dao.IAirlineDao;
import org.czw.flight.model.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AirlineServiceBackendImpl implements AirlineServiceBackend {
    @Autowired
    private IAirlineDao airlineDao;

    @Override
    @RequiresUser
    public Airline show(Integer airline_id) {
        return this.airlineDao.findById(airline_id);
    }

    @Override
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("airline:add")
    public boolean add(Airline airlineVo) {
        return this.airlineDao.doCreate(airlineVo);
    }

    @Override
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("airline:list")
    public List<Airline> list() {
        return this.airlineDao.findAll();
    }
}
