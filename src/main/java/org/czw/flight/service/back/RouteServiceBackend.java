package org.czw.flight.service.back;

import org.czw.flight.model.Route;

import java.util.List;
import java.util.Map;

public interface RouteServiceBackend {

    public boolean add(Route routeVo);
    public Map<String,Object> listSplit(Integer number, Integer currentPage, Integer lineSize);
    public List<Route> listByRid(Integer number);
    public boolean update(Route routeVo);
}
