package com.filiaiev.flightsservice.repository.flight.search;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FlightSearch {

    private FlightAirportSearch route;
    private LocalDate departureDate;
}
