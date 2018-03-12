package ru.bogdaniium.xml_configuration.udemy;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do track things.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
