package org.czw.flight.service.back;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.dao.IAirplaneDao;
import org.czw.flight.model.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhiwei_CHEN
 * @date 2021/12/03 19:29
 */
@Service
public class AirplaneServiceBackendImpl implements AirplaneServiceBackend {
    @Autowired
    private IAirplaneDao airplaneDao;

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:add")
    public boolean add(Airplane airplaneVo) {
        return this.airplaneDao.doCreate(airplaneVo);
    }

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:list")
    public Map<String, Object> listSplit(Integer number, Integer currentPage, Integer lineSize) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("start", (currentPage - 1) * lineSize);
        result.put("lineSize", lineSize);
        result.put("com_number", number);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data",this.airplaneDao.findAllBySplit(result));
        map.put("count",this.airplaneDao.getAllCount(result));
        return map;
    }

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:update")
    public boolean update(Airplane airplaneVo) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("airplaneId", airplaneVo.getAirplaneId());
        result.put("economy", airplaneVo.getEconomyClassQuota());
        result.put("first_class", airplaneVo.getFirstClassQuota());
        result.put("status", airplaneVo.getIsDeleted());
//        result.put("status", airplaneVo.getAirplaneType());
        return this.airplaneDao.doUpdate(result);
    }

    @Override
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:list")
    public List<Airplane> listByNumber(Integer number) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("airplaneId", number);
        return this.airplaneDao.findAllByNumber(result);
    }
}
