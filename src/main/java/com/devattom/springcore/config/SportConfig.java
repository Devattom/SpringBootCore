package com.devattom.springcore.config;

import com.devattom.springcore.coaches.SwimCoach;
import com.devattom.springcore.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
