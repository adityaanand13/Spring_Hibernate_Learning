package com.Spring_01_InversionOfControl;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "30 minutes on batting practise";
    }
}
