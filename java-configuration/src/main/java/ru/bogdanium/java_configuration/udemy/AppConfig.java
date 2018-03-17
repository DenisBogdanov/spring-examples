package ru.bogdanium.java_configuration.udemy;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ru.bogdanium.java_configuration.udemy")
@PropertySource("sport.properties")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Coach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }
}
