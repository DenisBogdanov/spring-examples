package ru.bogdanium.udemy;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class CoachSpringTest {

    Coach coach;
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("udemy-application-context.xml");

    @Test
    public void coachShouldReturnDailyWorkout() {
        coach = context.getBean("fitnessCoach", Coach.class);
        assertEquals("Do fitness things.", coach.getDailyWorkout());
    }

    @After
    public void preDestroy() {
        System.out.println("In preDestroy jUnit method");
        context.close();
    }
}