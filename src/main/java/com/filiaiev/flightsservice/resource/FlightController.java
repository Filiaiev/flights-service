package com.filiaiev.flightsservice.resource;

import com.filiaiev.flightsservice.resource.flight.CreateFlightRO;
import com.filiaiev.flightsservice.resource.flight.FlightRO;
import com.filiaiev.flightsservice.resource.flight.UpdateTrackUrlRO;
import com.filiaiev.flightsservice.resource.mapper.FlightResourceMapper;
import com.filiaiev.flightsservice.service.FlightService;
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
    public List<FlightRO> getFlights(@RequestParam("origin") String originIATA,
                                     @RequestParam("destination") String destinationIATA) {
        return flightMapper.mapFlightsToFlightROs(
                flightService.getFlights(originIATA, destinationIATA)
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
