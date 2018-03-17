package ru.bogdanium.kevin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("kevin-application-context.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);

        System.out.println(beanA.getBeanB().getMyProperty());
    }
}
