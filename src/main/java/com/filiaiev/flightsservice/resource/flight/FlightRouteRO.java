package com.filiaiev.flightsservice.resource.flight;

import lombok.Data;

@Data
public class FlightRouteRO {

    private AirportRO originAirport;
    private AirportRO destinationAirport;
    private Integer chargeableZoneRouteId;
}
