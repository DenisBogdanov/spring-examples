package ru.bogdanium.entity;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * Denis, 24.11.2018
 */
@Component
public class FootballGame implements Game {
    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;

    public FootballGame() {
    }

    public FootballGame(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @PostConstruct
    public void startGame() {
        System.out.println("Playing National Anthem!");
    }

    @PreDestroy
    public void endGame() {
        System.out.println("End of the game!");
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public String playGame() {
        return (Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName()) + " wins!";
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "FootballGame{" +
                "homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                '}';
    }
}
