package org.czw.flight.service.back;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.dao.IFlightDao;
import org.czw.flight.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class FlightServiceBackendImpl implements FlightServiceBackend {

    @Autowired
    private IFlightDao flightDao;

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("flight:add")
    public boolean add(Flight vo) {
        return this.flightDao.doCreate(vo);
    }

    @Override
    public Map<String, Object> listSplit(Integer number, int currentPage, int lineSize) {
        Map<String, Object> result = new HashMap<>();
        result.put("start", (currentPage - 1) * lineSize);
        result.put("lineSize", lineSize);
        result.put("comid", number);
        Map<String, Object> map = new HashMap<>();
        map.put("data",this.flightDao.findAllBySplit(result));
        map.put("count",this.flightDao.getAllCount(result));
        return map;
    }
}
