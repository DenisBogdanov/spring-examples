package ru.bogdaniium.xml_configuration.harry_potter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("harry-potter-application-context.xml");
        Battle battle = context.getBean(Battle.class);

        battle.start();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
