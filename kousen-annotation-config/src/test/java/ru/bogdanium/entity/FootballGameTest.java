package ru.bogdanium.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.bogdanium.config.AppConfig;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Denis, 24.11.2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class FootballGameTest {
    @Autowired
    private Game game;
    @Autowired
    private ApplicationContext context;

//    @Before
//    public void setUp() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        game = context.getBean("footballGame", Game.class);
//    }

    @Test
    public void testPlayGame() {
        String home = game.getHomeTeam().getName();
        String away = game.getAwayTeam().getName();

        String result = game.playGame();

        assertTrue(result.contains(home) || result.contains(away));
    }

    @Test
    public void testGetAndSetHomeTeam() {
        Team chemist = context.getBean("chemist", Team.class);
        game.setHomeTeam(chemist);
        assertEquals(chemist.getName(), game.getHomeTeam().getName());
    }
}