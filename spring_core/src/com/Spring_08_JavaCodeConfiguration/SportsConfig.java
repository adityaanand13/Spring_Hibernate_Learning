package com.Spring_08_JavaCodeConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//use @propertyScan("file relative path") to load property file
@ComponentScan("com.Spring_08_JavaCodeConfiguration")
public class SportsConfig {

    // you can remove @ComponentScan annotation and manually setup configuration for each component with @Bean annotation
    //method name will be the bean id

    // example

    /*
    @Bean
    public RandomFortuneService randomFortuneService () {
        return new RandomFortuneService
     */


    //how to inject dependency
    /*
    @Bean
    public VolleyballCoach volleyballCoach () {
        return new VolleyballCoach(randomFortuneService());
    }
     */


}
