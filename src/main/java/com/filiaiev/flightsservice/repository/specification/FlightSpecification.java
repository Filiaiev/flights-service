package com.filiaiev.flightsservice.repository.specification;

import com.filiaiev.flightsservice.repository.flight.FlightDO;
import com.filiaiev.flightsservice.repository.flight.search.FlightIATASearch;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

;

@Component
public class FlightSpecification {

    public Specification<FlightDO> hasIATARoute(FlightIATASearch iataSearch) {
        return (root, query, criteriaBuilder) ->
                iataSearch == null ? criteriaBuilder.conjunction() :
                        criteriaBuilder.and(
                                criteriaBuilder.equal(root.get("flightRoute").get("originAirport").get("iataCode"), iataSearch.getOriginIATA()),
                                criteriaBuilder.equal(root.get("flightRoute").get("destinationAirport").get("iataCode"), iataSearch.getDestinationIATA())
                        );

    }
}
