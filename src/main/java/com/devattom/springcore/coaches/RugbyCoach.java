package com.devattom.springcore.coaches;

import com.devattom.springcore.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 20 scrums";
    }
}
