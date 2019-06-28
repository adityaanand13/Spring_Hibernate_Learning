package com.Spring_02_DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/Spring_02_DependencyInjection/applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        //call methods for fortunes
        System.out.println(theCoach.getDailyFortune());
        //close the application context
        context.close();
    }
}
