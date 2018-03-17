package ru.bogdanium.java_configuration.udemy;

import org.springframework.stereotype.Component;

@Component
public class StupidFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You are a crazy fish.";
    }
}
