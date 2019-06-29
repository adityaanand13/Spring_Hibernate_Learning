package com.Spring_06_BeanScope;

public class CricketCoach implements Coach {

    //add new fields for injections
    private String EmailAddress;
    private String Team;

    // setter method for Dependency injection and getter to get values
    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    //private field for dependency injection
    private FortunateService fortunateService;

    // No arg constructor for spring to call
    public CricketCoach() {}

    // setter method for spring
    public void setFortunateService(FortunateService fortunateService) {
        this.fortunateService = fortunateService;
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
