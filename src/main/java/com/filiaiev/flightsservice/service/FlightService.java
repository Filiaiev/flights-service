package com.filiaiev.flightsservice.service;

import com.filiaiev.flightsservice.model.flight.Flight;
import com.filiaiev.flightsservice.repository.FlightRepository;
import com.filiaiev.flightsservice.repository.flight.FlightDO;
import com.filiaiev.flightsservice.repository.flight.search.FlightSearch;
import com.filiaiev.flightsservice.repository.specification.FlightSpecification;
import com.filiaiev.flightsservice.service.mapper.FlightServiceMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
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
                .orElseThrow(EntityNotFoundException::new);

        return flightMapper.mapFlightDOToFlight(flightDO);
    }

    public List<Flight> getFlights(String originIATA, String destinationIATA) {
        return flightMapper.mapFlightDOsToFlights(
                flightRepository.findAllByIATARoute(originIATA, destinationIATA)
        );
    }

    public void updateTrackUrl(Integer flightId, String trackUrl) {
        flightRepository.updateTrackUrl(flightId, trackUrl);
    }

    public void createFlight(Flight createFlight) {
        flightRepository.save(
                flightMapper.mapFlightToFlightDO(createFlight)
        );
    }

    public List<Flight> getFlights(FlightSearch flightSearch) {
        return flightMapper.mapFlightDOsToFlights(
                flightRepository.findAll(flightSpecification.hasIATARoute(flightSearch.getIataSearch()))
        );
    }
}
