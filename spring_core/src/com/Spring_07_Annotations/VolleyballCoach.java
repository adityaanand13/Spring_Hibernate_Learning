package com.Spring_07_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{

    private final FortuneService fortuneService;

    //parametrised constructor
    @Autowired
    public VolleyballCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println("Spring will use parametrised constructor to autowire volleyball coach");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practise upper shot with team";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunate();
    }
}
