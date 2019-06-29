package com.Spring_05_InjectingFromPropertyFile;

public class HappyFortuneService implements FortunateService {

    @Override
    public String getFortunate() {
        return "Today is your lucky Day";
    }
}
