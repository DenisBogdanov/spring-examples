package ru.bogdanium.xml_configuration.udemy;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CoachSpringTest {

    Coach coach;
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("udemy-application-context.xml");

    @Test
    public void coachShouldReturnDailyWorkout() {
        coach = context.getBean("coach", Coach.class);
        assertEquals("Do track things.", coach.getDailyWorkout());
    }

    @Test
    public void coachShouldReturnDailyFortune() {
        coach = context.getBean("fitnessCoach", Coach.class);
        assertEquals("Be happy.", coach.getDailyFortune());
    }

    @Test
    public void trackCoachShouldBeSingleton() {
        coach = context.getBean("coach", Coach.class);
        Coach newCoach = context.getBean("coach", Coach.class);
        assertEquals(coach, newCoach);
    }

    @Test
    public void fitnessCoachShouldBePrototype() {
        coach = context.getBean("fitnessCoach", Coach.class);
        Coach newCoach = context.getBean("fitnessCoach", Coach.class);
        assertNotEquals(coach, newCoach);
    }

    @Test
    public void trackCoachShouldReturnTeam() {
        coach = context.getBean("coach", Coach.class);
        assertEquals("Spartak", coach.getTeam());
    }

    @Test
    public void fitnessCoachShouldLoadTeamNameFromPropertiesFile() {
        coach = context.getBean("fitnessCoach", Coach.class);
        assertEquals("Denis", coach.getTeam());
    }

    @After
    public void preDestroy() {
        System.out.println("In preDestroy jUnit method");
        context.close();
    }
}