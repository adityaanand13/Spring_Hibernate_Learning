package com.Spring_03_SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext(
                "com/Spring_03_SetterInjection/applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach coach = classPathXmlApplicationContext.getBean("myCricketCoach", CricketCoach.class);

        // call methods on bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        // close the context
        classPathXmlApplicationContext.close();

    }
}
