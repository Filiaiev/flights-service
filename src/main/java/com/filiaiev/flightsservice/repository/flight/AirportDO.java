package com.filiaiev.flightsservice.repository.flight;

import com.filiaiev.flightsservice.repository.location.ZoneDO;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "airports")
@Data
public class AirportDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String address;

    private String city;

    private String country;

    private String postcode;

    @OneToOne
    private ZoneDO zone;

    private String iataCode;
}
