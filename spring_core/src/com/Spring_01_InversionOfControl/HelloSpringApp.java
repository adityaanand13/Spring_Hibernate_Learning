package com.Spring_01_InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/Spring_01_InversionOfControl/applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        //close the application context
        context.close();
    }
}
