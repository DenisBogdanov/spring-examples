package ru.bogdanium.bookstore.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bogdanium.bookstore.service.BookService;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bookstore-context.xml");
        BookService service = applicationContext.getBean(BookService.class);

        System.out.println(service.getEntireCatalogue());
    }
}
