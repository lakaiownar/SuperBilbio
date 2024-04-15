package edu.colval.exercises.td60.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandlerController {
    @GetMapping("/testNullPointerException")
    public String testNullPointerException() {
        throw new NullPointerException("This is a test NullPointerException");
    }

    @GetMapping("/testException")
    public String testException() {
        throw new RuntimeException("This is a test Exception");
    }
}
