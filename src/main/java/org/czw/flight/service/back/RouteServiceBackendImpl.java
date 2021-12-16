package org.czw.flight.service.back;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.dao.IRouteDao;
import org.czw.flight.model.Route;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RouteServiceBackendImpl implements RouteServiceBackend {
    @Resource
    private IRouteDao routeDao;

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:add")
    public boolean add(Route routeVo) {
        return this.routeDao.doCreate(routeVo);
    }

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:list")
    public Map<String, Object> listSplit(Integer number, Integer currentPage, Integer lineSize) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("start", (currentPage - 1) * lineSize);
        result.put("lineSize", lineSize);
        result.put("number", number);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data",this.routeDao.findAllBySplit(result));
        map.put("count",this.routeDao.getAllCount(result));
        return map;
    }

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:list")
    public List<Route> listByRid(Integer number) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("number", number);
        return this.routeDao.findAllByRid(result);
    }

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:update")
    public boolean update(Route routeVo) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("routeId", routeVo.getRouteId());
        result.put("landing", routeVo.getLandingAirport());
        result.put("departure", routeVo.getDepartureAirport());
        result.put("mileage", routeVo.getMileage());
        return this.routeDao.doUpdate(result);
    }
}
