package ru.bogdaniium.xml_configuration.udemy;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class CoachSpringTest {

    Coach coach;
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("udemy-application-context.xml");

    @Test
    public void coachShouldReturnDailyWorkout() {
        coach = context.getBean(Coach.class);
        assertEquals("Do track things.", coach.getDailyWorkout());
    }

    @Test
    public void coachShouldReturnDailyFortune() {
        coach = context.getBean(Coach.class);
        assertEquals("Be happy.", coach.getDailyFortune());
    }

    @After
    public void preDestroy() {
        System.out.println("In preDestroy method");
        context.close();
    }
}