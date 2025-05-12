package com.devattom.springcore.controllers;

import com.devattom.springcore.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private Coach coach;

    @Autowired
    public CoachController(@Qualifier("swimCoach") Coach coach) {

        System.out.println("In constructor: " + this.getClass().getSimpleName());

        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return coach.getDailyWorkout();
    }
}
