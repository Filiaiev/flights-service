package com.filiaiev.flightsservice.resource.flight;

import lombok.Data;

@Data
public class AirportRO {

    private Integer id;

    private String address;

    private String city;

    private String country;

    private String postcode;

    private String iataCode;
}
