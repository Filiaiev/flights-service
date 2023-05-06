package com.filiaiev.flightsservice.repository.specification;

import com.filiaiev.flightsservice.repository.flight.FlightDO;
import com.filiaiev.flightsservice.repository.flight.search.FlightAirportSearch;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class FlightSpecification {

    public Specification<FlightDO> hasAirportRoute(FlightAirportSearch airportRoute) {
        return (root, query, criteriaBuilder) ->
                airportRoute == null ? criteriaBuilder.conjunction() :
                        criteriaBuilder.and(
                                criteriaBuilder.equal(root.get("flightRoute").get("originAirport").get("iataCode"),
                                        airportRoute.getOrigin()),
                                criteriaBuilder.equal(root.get("flightRoute").get("destinationAirport").get("iataCode"),
                                        airportRoute.getDestination())
                        );

    }

    public Specification<FlightDO> hasDepartureDate(LocalDate departureDate) {
        return (root, query, criteriaBuilder) ->
                departureDate == null ? criteriaBuilder.conjunction() :
                        criteriaBuilder.equal(
                                criteriaBuilder.function("date", LocalDate.class, root.get("originDepartureTime")),
                                departureDate
                        );
    }

    // TODO: Introduce role based specification (not really a priority)
    public Specification<FlightDO> hasAircraftId(Integer aircraftId) {
        return (root, query, criteriaBuilder) ->
                aircraftId == null ? criteriaBuilder.conjunction() :
                        criteriaBuilder.equal(root.get("aircraft").get("id"), aircraftId);
    }
}
