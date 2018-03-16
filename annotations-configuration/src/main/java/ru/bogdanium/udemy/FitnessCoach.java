package ru.bogdanium.udemy;

import org.springframework.stereotype.Component;

@Component()
public class FitnessCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do fitness things.";
    }
}
