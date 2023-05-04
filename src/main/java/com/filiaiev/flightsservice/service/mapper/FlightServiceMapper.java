package com.filiaiev.flightsservice.service.mapper;

import com.filiaiev.flightsservice.model.flight.Flight;
import com.filiaiev.flightsservice.repository.flight.FlightDO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlightServiceMapper {

    Flight mapFlightDOToFlight(FlightDO flightDO);

    List<Flight> mapFlightDOsToFlights(List<FlightDO> flightDOs);

    FlightDO mapFlightToFlightDO(Flight flight);
}
