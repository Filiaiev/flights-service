package com.filiaiev.flightsservice.repository.flight;

import com.filiaiev.flightsservice.repository.location.ChargeableZoneRouteDO;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "flight_routes")
@Data
public class FlightRouteDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private AirportDO originAirport;

    @OneToOne
    private AirportDO destinationAirport;

    @OneToOne
    private ChargeableZoneRouteDO chargeableZoneRoute;
}
