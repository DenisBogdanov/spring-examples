package ru.bogdaniium.xml_configuration.udemy;

/**
 * Example of setter injection.
 */
public class FitnessCoach implements Coach {

    private FortuneService fortuneService;
    private String team;

    public FitnessCoach() {
        System.out.println("=====In no-arg constructor====");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("=====In setter method=====");
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Do fitness things.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getTeam() {
        return team;
    }

    @Override
    public void postInit() {

    }

    @Override
    public void preDestroy() {

    }
}
