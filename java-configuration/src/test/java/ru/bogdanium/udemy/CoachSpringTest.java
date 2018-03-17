package ru.bogdanium.udemy;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bogdanium.java_configuration.udemy.AppConfig;
import ru.bogdanium.java_configuration.udemy.Coach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CoachSpringTest {

    Coach coach;
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void coachShouldReturnDailyWorkout() {
        coach = context.getBean("swimCoach", Coach.class);
        assertEquals("Do your swim things.", coach.getDailyWorkout());
    }

    @Test
    public void coachShouldReturnDailyFortune() {
        coach = context.getBean("swimCoach", Coach.class);
        assertEquals("Today is your lucky day.", coach.getDailyFortune());
    }

    @Test
    public void coachShouldLoadEmailFromPropertiesFile() {
        coach = context.getBean("swimCoach", Coach.class);
        assertEquals("denis@bo.ru", coach.getEmail());
    }

    @Test
    public void coachesShouldBeDifferentObjects() {
        coach = context.getBean("swimCoach", Coach.class);
        Coach coach2 = context.getBean("swimCoach", Coach.class);
        assertNotEquals(coach, coach2);
    }

    @After
    public void preDestroy() {
        System.out.println("In preDestroy jUnit method");
        context.close();
    }
}