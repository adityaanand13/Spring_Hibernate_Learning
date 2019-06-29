package com.Spring_04_LiteralInjection;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    private FortunateService fortunateService;

    //define a constructor for the dependency injection
    public BaseballCoach(FortunateService fortunateService) {
        this.fortunateService = fortunateService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 minutes on batting practise";
    }

    @Override
    public String getDailyFortune() {
        //use my fortunateService for fortune
        return fortunateService.getFortunate();
    }
}
