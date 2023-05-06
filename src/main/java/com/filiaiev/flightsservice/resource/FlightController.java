package com.filiaiev.flightsservice.resource;

import com.filiaiev.flightsservice.repository.flight.search.FlightSearch;
import com.filiaiev.flightsservice.resource.flight.CreateFlightRO;
import com.filiaiev.flightsservice.resource.flight.FlightRO;
import com.filiaiev.flightsservice.resource.flight.UpdateTrackUrlRO;
import com.filiaiev.flightsservice.resource.flight.search.FlightSearchRO;
import com.filiaiev.flightsservice.resource.mapper.FlightResourceMapper;
import com.filiaiev.flightsservice.service.FlightService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;
    private final FlightResourceMapper flightMapper;

    @GetMapping("/{flightId}")
    public FlightRO getFlight(@PathVariable Integer flightId) {
        return flightMapper.mapFlightToFlightRO(
                flightService.getFlight(flightId)
        );
    }

    @GetMapping
    public List<FlightRO> getFlights(@Valid @RequestBody FlightSearchRO flightSearchRO) {
        FlightSearch flightSearch = flightMapper.mapFlightSearchROToFlightSearch(flightSearchRO);

        return flightMapper.mapFlightsToFlightROs(
                flightService.getFlights(flightSearch)
        );
    }

    @PatchMapping("/{flightId}/trackUrl")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTrackUrl(@PathVariable Integer flightId, @RequestBody UpdateTrackUrlRO trackUrlRO) {
        flightService.updateTrackUrl(flightId, trackUrlRO.getTrackUrl());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createFlight(@RequestBody CreateFlightRO createFlightRO) {
        flightService.createFlight(
                flightMapper.mapCreateFlightROToFlight(createFlightRO)
        );
    }
}
