package org.czw.flight.service.back;

import org.czw.flight.model.Flight;

import java.util.Map;

public interface FlightServiceBackend {
    public boolean add(Flight flightVo);

    public Map<String, Object> listSplit(Integer number, int currentPage, int lineSize);
}
