package com.Rough_InversionOfControl;

public class MyApp {
    public static void main(String[] args) {
        //create POJO
        Coach baseballCoach = new TrackCoach();
        //use POJO
        System.out.println(baseballCoach.getDailyWorkout());
    }
}
