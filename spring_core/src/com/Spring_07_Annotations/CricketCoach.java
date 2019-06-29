package com.Spring_07_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "practise batting on yorker";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunate();
    }

    // non setter method
    @Autowired
    @Qualifier("happyFortuneService")
    public void defineFortune(FortuneService theFortuneService){
        fortuneService = theFortuneService;
        System.out.println("Spring will use non-setter method to autowire volleyball coach");
    }

}
