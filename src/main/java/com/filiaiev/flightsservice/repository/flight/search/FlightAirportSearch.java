package com.filiaiev.flightsservice.repository.flight.search;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightAirportSearch {

    private String origin;
    private String destination;
}
