package com.devattom.springcore.coaches;

import com.devattom.springcore.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    public GymCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 20 push-ups";
    }
}
