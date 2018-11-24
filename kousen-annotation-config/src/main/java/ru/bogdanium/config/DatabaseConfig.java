package ru.bogdanium.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Denis, 24.11.2018
 */
@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }
}
