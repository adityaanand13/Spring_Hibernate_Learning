package com.Spring_06_BeanScope;


public class TrackCoach implements Coach {

    //define a private field for the dependency
    private FortunateService fortunateService;

    //define a constructor for the dependency injection
    public TrackCoach(FortunateService fortunateService) {
        this.fortunateService = fortunateService;
    }

    public TrackCoach() { }

    @Override
    public String getDailyWorkout() {
        return "Run 5kms Daily";
    }

    @Override
    public String getDailyFortune() {
        return "just do it" + fortunateService.getFortunate();
    }

    // add an init method
    public void initMethod(){ System.out.println("initialising track coach object"); }

    // add a destroy method
    public void destroyMethod(){ System.out.println("Destroying track coach object"); }
}
