package ru.bogdanium.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.bogdanium.entity.Barcelona;
import ru.bogdanium.entity.Chemist;
import ru.bogdanium.entity.FootballGame;
import ru.bogdanium.entity.Game;
import ru.bogdanium.entity.Team;

import javax.sql.DataSource;

/**
 * Denis, 24.11.2018
 */
@Configuration
@Import(DatabaseConfig.class)
public class AppConfig {

    @Bean
    @Autowired
    public Game footballGame(DataSource dataSource) {
        FootballGame footballGame = new FootballGame(chemist(), barcelona());
        footballGame.setDataSource(dataSource);
        return footballGame;
    }

    @Bean
    public Team barcelona() {
        return new Barcelona();
    }

    @Bean
    public Team chemist() {
        return new Chemist();
    }
}
