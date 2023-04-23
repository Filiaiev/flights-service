package com.filiaiev.flightsservice.model.location;

import lombok.Data;

@Data
public class City {

    private Integer id;
    private Country country;
    private String name;
}
