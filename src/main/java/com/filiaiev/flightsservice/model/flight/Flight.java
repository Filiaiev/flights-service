package com.filiaiev.flightsservice.model.flight;

import lombok.Data;

import java.time.Instant;

@Data
public class Flight {

    private Integer id;
    private Aircraft aircraft;
    private FlightRoute flightRoute;
    private Instant originDepartureTime;
    private Instant destinationArrivalTime;
    private Instant bookableUntil;
    private Double maxPayload;
    private Double maxVolume;
    private String trackUrl;
}
