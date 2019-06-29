package com.Spring_07_Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read the spring file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("com/Spring_07_Annotations/applicationContext.xml");

        // get the beans from the container using component name
        Coach tCoach = classPathXmlApplicationContext.getBean("TennisCoachINT", Coach.class);
        //using default bean id
        Coach vBall = classPathXmlApplicationContext.getBean("volleyballCoach", Coach.class);
        Coach fBall = classPathXmlApplicationContext.getBean("footballCoach", Coach.class);
        Coach cCoach = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class );
        System.out.println();

        // call the a method on bean
        System.out.println(tCoach.getDailyWorkout());
        System.out.println(tCoach.getDailyFortune());
        System.out.println();
        System.out.println(vBall.getDailyWorkout());
        System.out.println(vBall.getDailyFortune());
        System.out.println();
        System.out.println(fBall.getDailyWorkout());
        System.out.println(fBall.getDailyFortune());
        System.out.println();
        System.out.println(cCoach.getDailyWorkout());
        System.out.println(cCoach.getDailyFortune());

        // close the container
        classPathXmlApplicationContext.close();
    }
}
