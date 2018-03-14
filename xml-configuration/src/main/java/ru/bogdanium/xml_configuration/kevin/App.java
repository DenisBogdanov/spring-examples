package ru.bogdanium.xml_configuration.kevin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("kevin-application-context.xml");

        Bean bean = context.getBean("bean", Bean.class);

        System.out.println(bean.getList());
        System.out.println(bean.getSet());
        System.out.println(bean.getMap());

        BeanA beanA = context.getBean("beanA", BeanA.class);
    }
}
