package com.filiaiev.flightsservice.service;

import com.filiaiev.flightsservice.exception.FlightException;
import com.filiaiev.flightsservice.model.flight.Flight;
import com.filiaiev.flightsservice.repository.FlightRepository;
import com.filiaiev.flightsservice.repository.flight.FlightDO;
import com.filiaiev.flightsservice.repository.flight.search.FlightSearch;
import com.filiaiev.flightsservice.repository.specification.FlightSpecification;
import com.filiaiev.flightsservice.service.mapper.FlightServiceMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;
    private final FlightSpecification flightSpecification;
    private final FlightServiceMapper flightMapper;

    public Flight getFlight(Integer id) {
        FlightDO flightDO = flightRepository.findById(id)
                .orElseThrow(() -> new FlightException("Flight not found", HttpStatus.NOT_FOUND));

        return flightMapper.mapFlightDOToFlight(flightDO);
    }

    public List<Flight> getFlights(FlightSearch flightSearch) {
        Specification<FlightDO> searchSpecification = Specification.allOf(
                flightSpecification.hasAirportRoute(flightSearch.getRoute()),
                flightSpecification.hasDepartureDate(flightSearch.getDepartureDate())
        );

        return flightMapper.mapFlightDOsToFlights(
                flightRepository.findAll(searchSpecification)
        );
    }

    public void createFlight(Flight createFlight) {
        flightRepository.save(
                flightMapper.mapFlightToFlightDO(createFlight)
        );
    }

    public void updateTrackUrl(Integer flightId, String trackUrl) {
        flightRepository.updateTrackUrl(flightId, trackUrl);
    }
}
