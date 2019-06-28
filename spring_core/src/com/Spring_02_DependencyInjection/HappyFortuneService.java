package com.Spring_02_DependencyInjection;

public class HappyFortuneService implements FortunateService {

    @Override
    public String getFortunate() {
        return "Today is your lucky Day";
    }
}
