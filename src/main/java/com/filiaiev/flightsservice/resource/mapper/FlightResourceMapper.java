package com.filiaiev.flightsservice.resource.mapper;

import com.filiaiev.flightsservice.model.flight.Flight;
import com.filiaiev.flightsservice.repository.flight.search.FlightSearch;
import com.filiaiev.flightsservice.resource.flight.CreateFlightRO;
import com.filiaiev.flightsservice.resource.flight.FlightRO;
import com.filiaiev.flightsservice.resource.flight.search.FlightSearchRO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlightResourceMapper {

    @Mapping(target = "flightRoute.chargeableZoneRouteId", source = "flightRoute.chargeableZoneRoute.id")
    FlightRO mapFlightToFlightRO(Flight flight);

    List<FlightRO> mapFlightsToFlightROs(List<Flight> flights);

    @Mapping(target = "aircraft.id", source = "aircraftId")
    @Mapping(target = "flightRoute.id", source = "flightRouteId")
    Flight mapCreateFlightROToFlight(CreateFlightRO createFlightRO);

    FlightSearch mapFlightSearchROToFlightSearch(FlightSearchRO flightSearchRO);
}
