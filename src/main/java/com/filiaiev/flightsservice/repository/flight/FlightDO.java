package com.filiaiev.flightsservice.repository.flight;

import com.filiaiev.flightsservice.repository.location.ChargeableZoneRouteDO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.Instant;

@Entity(name = "flights_with_chargeable_routes")
@Data
public class FlightDO implements FlightView {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private AircraftDO aircraft;

    @OneToOne
    private FlightRouteDO flightRoute;

    @OneToOne
    private ChargeableZoneRouteDO chargeableZoneRoute;

    // Say that date time is a local time
    private Instant originDepartureTime;

    private Instant destinationArrivalTime;

    private Double maxPayload;

    private Double maxVolume;

    private String trackUrl;
}
