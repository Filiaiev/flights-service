package com.filiaiev.flightsservice.resource.flight;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.Instant;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightRO {

    private Integer id;
    private AircraftRO aircraft;
    private Integer chargeableZoneRouteId;
    private FlightRouteRO flightRoute;
    private Integer zoneRouteId;
    private Instant originDepartureTime;
    private Instant destinationArrivalTime;
    private Double maxPayload;
    private Double maxVolume;
    private String trackUrl;
}
