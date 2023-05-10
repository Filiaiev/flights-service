package com.filiaiev.flightsservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class FlightException extends RuntimeException {

    private final HttpStatus statusCode;

    public FlightException(String message, HttpStatus statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public FlightException(String message) {
        this(message, HttpStatus.BAD_REQUEST);
    }
}
