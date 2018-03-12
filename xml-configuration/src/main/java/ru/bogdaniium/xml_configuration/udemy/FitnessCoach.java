package ru.bogdaniium.xml_configuration.udemy;

public class FitnessCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do fitness things.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
