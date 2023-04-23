package com.filiaiev.flightsservice.resource.flight;

import com.filiaiev.flightsservice.resource.location.AddressRO;
import lombok.Data;

@Data
public class AirportRO {

    private AddressRO addressRO;
    private String iataCode;
}
