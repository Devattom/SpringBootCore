package com.devattom.springcore.controllers;

import com.devattom.springcore.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private Coach coach;

    @Autowired
    CoachController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return coach.getDailyWorkout();
    }
}
