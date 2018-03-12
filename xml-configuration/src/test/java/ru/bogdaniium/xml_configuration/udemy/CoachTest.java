package ru.bogdaniium.xml_configuration.udemy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoachTest {

    Coach coach;

    @Test
    public void coachShouldReturnDailyWorkout() {
        coach = new TrackCoach();
        assertEquals("Do track things.", coach.getDailyWorkout());
    }
}