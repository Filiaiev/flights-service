package com.filiaiev.flightsservice.model.flight;

import lombok.Data;

@Data
public class FlightRoute {

    private Integer id;
    private Airport originAirport;
    private Airport destinationAirport;
}
