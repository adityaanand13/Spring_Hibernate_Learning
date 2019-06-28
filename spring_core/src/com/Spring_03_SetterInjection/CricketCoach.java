package com.Spring_03_SetterInjection;

public class CricketCoach implements Coach {

    //private field for dependency injection
    private FortunateService fortunateService;

    // No arg constructor for spring to call
    public CricketCoach() {
        System.out.println("Cricket coach: Inside no arg constructor");
    }

    // setter method for spring
    public void setFortunateService(FortunateService fortunateService) {
        this.fortunateService = fortunateService;
        System.out.println("Cricket coach: Inside the setter method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise Fast bowling for 30 mins a day";
    }

    @Override
    public String getDailyFortune() {
        return fortunateService.getFortunate();
    }
}
