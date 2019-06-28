package com.Spring_01_InversionOfControl;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 5kms Daily";
    }
}
