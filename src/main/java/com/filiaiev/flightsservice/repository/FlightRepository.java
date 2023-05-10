package com.filiaiev.flightsservice.repository;

import com.filiaiev.flightsservice.repository.flight.FlightDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightDO, Integer>, JpaSpecificationExecutor<FlightDO> {

    default FlightDO updateTrackUrl(Integer flightId, String trackUrl) {
        FlightDO flight = getReferenceById(flightId);
        flight.setTrackUrl(trackUrl);

        return save(flight);
    }
}
