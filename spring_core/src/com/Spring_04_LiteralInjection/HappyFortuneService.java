package com.Spring_04_LiteralInjection;

public class HappyFortuneService implements FortunateService {

    @Override
    public String getFortunate() {
        return "Today is your lucky Day";
    }
}
