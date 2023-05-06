package com.filiaiev.flightsservice.repository;

import com.filiaiev.flightsservice.repository.flight.FlightRouteDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRouteRepository extends JpaRepository<FlightRouteDO, Integer> {

    @Query("SELECT fr FROM flight_routes fr WHERE fr.originAirport.id = ?1 AND fr.destinationAirport = ?2")
    FlightRouteDO findFlightRouteByAirportIds(Integer originAirportId, Integer destinationAirportId);
}
