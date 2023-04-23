package com.filiaiev.flightsservice.model.flight;

import com.filiaiev.flightsservice.model.location.Address;
import lombok.Data;

@Data
public class Airport {

    private Integer id;
    private Address address;
    private String iataCode;
}
