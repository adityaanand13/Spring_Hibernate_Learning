package com.Spring_03_SetterInjection;

public class HappyFortuneService implements FortunateService {

    @Override
    public String getFortunate() {
        return "Today is your lucky Day";
    }
}
