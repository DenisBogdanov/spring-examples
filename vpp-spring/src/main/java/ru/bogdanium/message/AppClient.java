package ru.bogdanium.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Denis, 30.09.2018
 */
public class AppClient {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("message-context.xml");
        MessageService service = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(service.getMessage());

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
