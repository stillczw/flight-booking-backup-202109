package org.czw.flight.service.back;

import org.czw.flight.model.Airplane;

import java.util.List;
import java.util.Map;

public interface AirplaneServiceBackend {
    public boolean add(Airplane airplaneVo);
    public Map<String,Object> listSplit(Integer number, Integer currentPage, Integer lineSize);

    public boolean update(Airplane airplaneVo);
    public List<Airplane> listByNumber(Integer number);
}
