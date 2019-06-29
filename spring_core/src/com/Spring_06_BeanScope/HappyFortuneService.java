package com.Spring_06_BeanScope;

public class HappyFortuneService implements FortunateService {

    @Override
    public String getFortunate() {
        return "Today is your lucky Day";
    }
}
