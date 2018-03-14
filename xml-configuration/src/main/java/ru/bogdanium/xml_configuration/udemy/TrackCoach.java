package ru.bogdanium.xml_configuration.udemy;

/**
 * Example of constructor injection.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String team;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService, String team) {
        System.out.println("=====In two-arg constructor=====");
        this.fortuneService = fortuneService;
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public void postInit() {
        System.out.println("=====In postInit method=====");
    }

    @Override
    public void preDestroy() {
        System.out.println("=====In preDestroy method=====");
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
