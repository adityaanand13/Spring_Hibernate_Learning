package com.Spring_07_Annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] Fortunes = {"Today is your lucky Day",
            "Those who practise will win",
            "Team spirit will win",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortunate() {
        return Fortunes[myRandom.nextInt(Fortunes.length)];
    }
}
