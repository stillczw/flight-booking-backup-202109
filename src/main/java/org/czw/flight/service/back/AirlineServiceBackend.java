package org.czw.flight.service.back;

import org.czw.flight.model.Airline;

import java.util.List;

public interface AirlineServiceBackend {
    public Airline show(Integer number);

    public boolean add(Airline vo);
    public List<Airline> list();
}
