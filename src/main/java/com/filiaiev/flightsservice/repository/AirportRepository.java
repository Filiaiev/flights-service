package com.filiaiev.flightsservice.repository;

import com.filiaiev.flightsservice.repository.flight.AirportDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<AirportDO, Integer> {

}
