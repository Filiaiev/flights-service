package com.filiaiev.flightsservice.repository.flight;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "flight_routes")
@Data
public class FlightRouteDO {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private AirportDO originAirport;

    @OneToOne
    private AirportDO destinationAirport;
}
