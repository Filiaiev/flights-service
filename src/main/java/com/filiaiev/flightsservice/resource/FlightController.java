package com.filiaiev.flightsservice.resource;

import com.filiaiev.flightsservice.repository.FlightRepository;
import com.filiaiev.flightsservice.repository.flight.FlightDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/")
    public List<FlightDO> getFlights() {
        return flightRepository.findAll();
    }
}
