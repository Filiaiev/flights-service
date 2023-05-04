package com.filiaiev.flightsservice.resource.flight;

import lombok.Data;

import java.time.Instant;

@Data
public class CreateFlightRO {

    private Integer aircraftId;
    private Integer flightRouteId;
    private Instant originDepartureTime;
    private Instant destinationArrivalTime;
    private Double maxPayload;
    private Double maxVolume;
}
