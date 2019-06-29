package com.Spring_08_JavaCodeConfiguration;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortunate() {
        return "Today is your lucky Day";
    }
}
