package com.Spring_05_InjectingFromPropertyFile;

public class CricketCoach implements Coach {

    //add new fields for injections
    private String EmailAddress;
    private String Team;

    // setter method for Dependency injection and getter to get values
    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket coach: Inside the setter method for : emailAddress");
        EmailAddress = emailAddress;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach: Inside the setter method for : team");
        Team = team;
    }

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
