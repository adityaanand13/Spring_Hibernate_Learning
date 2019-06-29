package com.Spring_05_InjectingFromPropertyFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext(
                "com/Spring_05_InjectingFromPropertyFile/applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach coach = classPathXmlApplicationContext.getBean("myCricketCoach", CricketCoach.class);

        // call methods on bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        //call getter values
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        // close the context
        classPathXmlApplicationContext.close();

    }
}
