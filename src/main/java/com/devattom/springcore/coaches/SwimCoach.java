package com.devattom.springcore.coaches;

import com.devattom.springcore.interfaces.Coach;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 20 kms !";
    }
}
