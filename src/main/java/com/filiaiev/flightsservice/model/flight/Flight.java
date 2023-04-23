package com.filiaiev.flightsservice.model.flight;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Flight {

    private Integer id;
    private Aircraft aircraft;
    private FlightRoute flightRoute;
    private ZonedDateTime originDepartureTime;
    private ZonedDateTime destinationArrivalTime;
    private Double maxPayload;
    private Double maxVolume;
    private String trackUrl;
}
