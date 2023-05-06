package com.filiaiev.flightsservice.resource.flight;

import lombok.Data;

@Data
public class CreateFlightAirportRouteRO {

    private Integer originAirportId;
    private Integer destinationAirportId;
}
