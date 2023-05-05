package com.filiaiev.flightsservice.model.flight;

import com.filiaiev.flightsservice.model.location.ChargeableZoneRoute;
import lombok.Data;

@Data
public class FlightRoute {

    private Integer id;
    private Airport originAirport;
    private Airport destinationAirport;
    private ChargeableZoneRoute chargeableZoneRoute;
}
