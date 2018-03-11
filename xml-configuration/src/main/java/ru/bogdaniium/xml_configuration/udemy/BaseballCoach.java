package ru.bogdaniium.xml_configuration.udemy;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practise";
    }
}
