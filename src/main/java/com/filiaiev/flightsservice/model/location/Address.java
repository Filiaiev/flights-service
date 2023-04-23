package com.filiaiev.flightsservice.model.location;

import lombok.Data;

@Data
public class Address {

    private Integer id;
    private City city;
    private String address;
    private String postcode;
}
