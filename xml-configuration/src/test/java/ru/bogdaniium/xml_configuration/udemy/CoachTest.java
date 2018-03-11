package ru.bogdaniium.xml_configuration.udemy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoachTest {

    Coach coach;

    @Test
    public void baseballCoachShouldReturnDailyWorkout() {
        coach = new BaseballCoach();
        assertEquals("Spend 30 minutes on batting practise", coach.getDailyWorkout());
    }

    @Test
    public void trackCoachShouldReturnDailyWorkout() {
        coach = new TrackCoach();
        assertEquals("Run a hard 5k", coach.getDailyWorkout());
    }
}