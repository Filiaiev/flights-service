package com.filiaiev.flightsservice.resource.flight.search;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class FlightAirportSearchRO {

    private static final String IATA_REGEX = "[A-Z]{3}";

    @NotNull
    @Pattern(regexp = IATA_REGEX)
    private String origin;

    @NotNull
    @Pattern(regexp = IATA_REGEX)
    private String destination;
}
