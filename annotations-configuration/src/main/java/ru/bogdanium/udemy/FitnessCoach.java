package ru.bogdanium.udemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FitnessCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${coach.email}")
    private String email;

    public FitnessCoach() {
    }

    @Autowired
    public FitnessCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("FitnessCoach constructor.");
        this.fortuneService = fortuneService;
    }

//    @Autowired
//    @Qualifier(value = "happyFortuneService")
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("In setFortuneService() method.");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Do fitness things.";
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
