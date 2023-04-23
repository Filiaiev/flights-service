package com.filiaiev.flightsservice.model.location;

import lombok.Data;

@Data
public class Country {

    private Integer id;
    private Zone zone;
    private String name;
}
