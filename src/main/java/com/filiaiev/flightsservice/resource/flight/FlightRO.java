package com.filiaiev.flightsservice.resource.flight;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.filiaiev.flightsservice.model.flight.Aircraft;
import com.filiaiev.flightsservice.model.flight.FlightRoute;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightRO {

    private Integer id;
    private Aircraft aircraft;
    private FlightRoute flightRoute;
    private ZonedDateTime originDepartureTime;
    private ZonedDateTime destinationArrivalTime;
    private Double maxPayload;
    private Double maxVolume;
    private String trackUrl;
}
