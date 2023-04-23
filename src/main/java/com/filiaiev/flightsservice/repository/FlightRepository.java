package com.filiaiev.flightsservice.repository;

import com.filiaiev.flightsservice.repository.flight.FlightDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<FlightDO, Integer> {
}
