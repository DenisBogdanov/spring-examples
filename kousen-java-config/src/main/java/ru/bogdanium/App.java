package ru.bogdanium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bogdanium.config.AppConfig;
import ru.bogdanium.entity.Game;

/**
 * Denis, 24.11.2018
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("footballGame", Game.class);
        System.out.println(game.playGame());

        System.out.println("There are " + context.getBeanDefinitionCount() + " beans");

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
