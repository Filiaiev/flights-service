package com.filiaiev.flightsservice.repository.flight.search;

import lombok.Data;
import lombok.NonNull;

@Data
public class FlightIATASearch {

    // use javax.validation instead of lombok
    @NonNull
    private String originIATA;

    @NonNull
    private String destinationIATA;
}
