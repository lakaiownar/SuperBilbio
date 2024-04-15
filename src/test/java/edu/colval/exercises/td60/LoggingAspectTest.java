package edu.colval.exercises.td60;

import edu.colval.exercises.td60.bll.services.AspectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggingAspectTest {

    @Autowired
    private AspectService aspectService;

    @Test
    public void testLoggingAspect() {
        aspectService.testMethod();
    }
}