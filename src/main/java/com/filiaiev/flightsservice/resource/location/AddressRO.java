package com.filiaiev.flightsservice.resource.location;

import lombok.Data;

@Data
public class AddressRO {

    private CityRO city;
    private String fullAddress;
}
