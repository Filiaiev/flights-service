package com.filiaiev.flightsservice.repository.flight;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity(name = "flights")
@Data
public class FlightDO {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private AircraftDO aircraft;

    @OneToOne
    private FlightRouteDO flightRoute;

    // Say that date time is a local time
    private ZonedDateTime originDepartureTime;

    private ZonedDateTime destinationArrivalTime;

    private Double maxPayload;

    private Double maxVolume;

    private String trackUrl;
}
