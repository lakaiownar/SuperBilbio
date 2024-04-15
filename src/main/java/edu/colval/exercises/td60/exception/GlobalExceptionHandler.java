package edu.colval.exercises.td60.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
        // Log with SLF4J using Date then error message
        log.error("Date: " + java.time.LocalDateTime.now() + " - Error: " + ex.getMessage());
        // Return of the error message
        return new ResponseEntity<>("NullPointerException: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Log with SLF4J using Date then error message
        log.error("Date: " + java.time.LocalDateTime.now() + " - Error: " + ex.getMessage());
        // Return of the error message
        return new ResponseEntity<>("An error has occured: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
