package com.Spring_06_BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        // load the spring file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext
                ("com/Spring_06_BeanScope/applicationContext.xml");

        // for default scope (singleton)
            // load bean from spring container
            Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
            Coach coach2 = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

            //comparing the both objects
            boolean compare = (coach == coach2);
            System.out.println(compare);

            //showing that both the class refer to which object
            System.out.println("coach: "+ coach.toString());
            System.out.println("coach1: "+ coach2.toString());

         // for prototype scope defined in configuration
            // load bean from spring container
            Coach cricketCoach = classPathXmlApplicationContext.getBean("myCricketCoach", Coach.class);
            Coach cricketCoach2 = classPathXmlApplicationContext.getBean("myCricketCoach", Coach.class);

            //comparing the both objects
            boolean compare2 = (cricketCoach == cricketCoach2);
            System.out.println(compare2);

            //showing that both the class refer to which object
            System.out.println("cricket coach: "+ cricketCoach.toString());
            System.out.println("cricket coach1: "+ cricketCoach2.toString());

        //close the context (bean objects will be destroyed)
        classPathXmlApplicationContext.close();

    }
}
