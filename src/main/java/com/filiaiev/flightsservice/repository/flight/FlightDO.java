package com.filiaiev.flightsservice.repository.flight;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity(name = "flights")
@Data
public class FlightDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private AircraftDO aircraft;

    @OneToOne
    private FlightRouteDO flightRoute;

    // Say that date time is a local time
    private Instant originDepartureTime;

    private Instant destinationArrivalTime;

    private Double maxPayload;

    private Double maxVolume;

    private String trackUrl;
}
