package com.filiaiev.flightsservice.model.flight;

import com.filiaiev.flightsservice.model.location.Zone;
import lombok.Data;

@Data
public class Airport {

    private Integer id;

    private String address;

    private String city;

    private String country;

    private String postcode;

    private Zone zone;

    private String iataCode;
}
