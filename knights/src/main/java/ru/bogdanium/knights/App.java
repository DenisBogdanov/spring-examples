package ru.bogdanium.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Knight knight = context.getBean("knight", Knight.class);
        knight.embarkOnQuest();
    }
}
