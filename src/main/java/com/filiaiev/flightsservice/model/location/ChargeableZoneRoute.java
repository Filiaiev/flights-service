package com.filiaiev.flightsservice.model.location;

import lombok.Data;

@Data
public class ChargeableZoneRoute {

    private Integer id;
    private Zone originZone;
    private Zone destinationZone;
}
