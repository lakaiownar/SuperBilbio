package edu.colval.exercises.td60.bll.services;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

    public void testMethod() {
        // Simulate a time-consuming task
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}