package ru.bogdanium.entity;

/**
 * Denis, 24.11.2018
 */
public interface Game {
    void setHomeTeam(Team team);

    Team getHomeTeam();

    void setAwayTeam(Team team);

    Team getAwayTeam();

    String playGame();
}
