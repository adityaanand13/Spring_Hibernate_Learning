package com.Spring_08_JavaCodeConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read the spring file
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SportsConfig.class);

        // get the beans from the container using component name
        Coach tCoach = annotationConfigApplicationContext.getBean("TennisCoachINT", Coach.class);
        //using default bean id
        Coach vBall = annotationConfigApplicationContext.getBean("volleyballCoach", Coach.class);
        Coach fBall = annotationConfigApplicationContext.getBean("footballCoach", Coach.class);
        Coach cCoach = annotationConfigApplicationContext.getBean("cricketCoach", Coach.class );
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
        annotationConfigApplicationContext.close();
    }
}
