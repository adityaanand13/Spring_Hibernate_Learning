package com.Spring_08_JavaCodeConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practise dribbling for 10 minutes daily ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunate();
    }

    //setter method
    @Autowired
    @Qualifier("randomFortuneService")
    public void setHappyFortuneService(FortuneService fortuneService) {
        System.out.println("spring will use setter method to autowire football coach");
        this.fortuneService = fortuneService;
    }
}
