package com.filiaiev.flightsservice.resource.flight.search;

import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FlightSearchRO {

    @Valid
    private FlightAirportSearchRO route;

    @FutureOrPresent
    private LocalDate departureDate;
}
