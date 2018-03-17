package ru.bogdanium.udemy;

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
        coach = context.getBean("fitnessCoach", Coach.class);
        assertEquals("Do fitness things.", coach.getDailyWorkout());
    }

    @Test
    public void coachShouldReturnDailyFortune() {
        coach = context.getBean("fitnessCoach", Coach.class);
        assertEquals("Today is your lucky day.", coach.getDailyFortune());
    }

    @Test
    public void coachShouldLoadEmailFromPropertiesFile() {
        coach = context.getBean("fitnessCoach", Coach.class);
        assertEquals("denis@bo.ru", coach.getEmail());
    }

    @Test
    public void coachesShouldBeDifferentObjects() {
        coach = context.getBean("fitnessCoach", Coach.class);
        Coach coach2 = context.getBean("fitnessCoach", Coach.class);
        assertNotEquals(coach, coach2);
    }

    @After
    public void preDestroy() {
        System.out.println("In preDestroy jUnit method");
        context.close();
    }
}