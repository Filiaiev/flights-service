package com.filiaiev.flightsservice.repository.flight;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "aircrafts")
@Data
public class AircraftDO {

    @Id
    @GeneratedValue
    private Integer id;

    private String callsign;

    private String title;
}
