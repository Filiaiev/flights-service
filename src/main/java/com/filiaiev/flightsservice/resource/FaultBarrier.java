package com.filiaiev.flightsservice.resource;

import com.filiaiev.flightsservice.exception.ErrorDetails;
import com.filiaiev.flightsservice.exception.FlightException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
@Slf4j
public class FaultBarrier {

    @ExceptionHandler(FlightException.class)
    public ResponseEntity<ErrorDetails> handleOrderCreationException(FlightException ex, WebRequest request) {
        return prepareErrorResponse(ex, ex.getMessage(), request, ex.getStatusCode());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleException(Exception ex, WebRequest request) {
        return prepareErrorResponse(ex, ex.getMessage(), request, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ErrorDetails> prepareErrorResponse(Exception ex, String message, WebRequest request, HttpStatus httpStatus) {
        log.error(ex.getMessage(), ex);

        return new ResponseEntity<>(new ErrorDetails(message, request.getDescription(false)), httpStatus);
    }
}
