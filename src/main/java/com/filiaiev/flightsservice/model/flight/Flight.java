package com.filiaiev.flightsservice.model.flight;

import com.filiaiev.flightsservice.model.location.ChargeableZoneRoute;
import lombok.Data;

import java.time.Instant;

@Data
public class Flight {

    private Integer id;
    private Aircraft aircraft;
    private ChargeableZoneRoute chargeableZoneRoute;
    private FlightRoute flightRoute;
    private Instant originDepartureTime;
    private Instant destinationArrivalTime;
    private Double maxPayload;
    private Double maxVolume;
    private String trackUrl;
}
