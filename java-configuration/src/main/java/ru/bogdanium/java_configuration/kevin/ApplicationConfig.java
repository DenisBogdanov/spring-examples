package ru.bogdanium.java_configuration.kevin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("ru.bogdanium.java_configuration.kevin")
public class ApplicationConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA(beanB());
    }

    @Bean
    public BeanB beanB() {
        return new BeanB();
    }
}
