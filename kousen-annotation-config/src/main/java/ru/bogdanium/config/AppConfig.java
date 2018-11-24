package ru.bogdanium.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.bogdanium.entity.FootballGame;
import ru.bogdanium.entity.Game;
import ru.bogdanium.entity.Spartak;
import ru.bogdanium.entity.Team;

import javax.sql.DataSource;

/**
 * Denis, 24.11.2018
 */
@Configuration
@ComponentScan(basePackages = "ru.bogdanium")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    @Autowired
//    @Scope("prototype")
    public Game footballGame(DataSource dataSource,
                             @Qualifier("chemist") Team home,
                             @Qualifier("barcelona") Team away) {
        FootballGame footballGame = new FootballGame(home, away);
        footballGame.setDataSource(dataSource);
        return footballGame;
    }

    @Bean
    public Team spartak() {
        return new Spartak();
    }
}
