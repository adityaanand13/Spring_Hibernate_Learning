package com.Spring_07_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("TennisCoachINT")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //default constructor
    public TennisCoach() {
        System.out.println("Spring will use this DEFAULT constructor to Autowire private field");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise corner shot daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunate();
    }

}
