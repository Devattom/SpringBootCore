package com.devattom.springcore.coaches;

import com.devattom.springcore.interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MartialArtCoach implements Coach {

    public MartialArtCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 20 front kicks";
    }
}
