package ru.bogdanium;

import ru.bogdanium.entity.Barcelona;
import ru.bogdanium.entity.Chemist;
import ru.bogdanium.entity.FootballGame;
import ru.bogdanium.entity.Game;
import ru.bogdanium.entity.Team;

/**
 * Denis, 24.11.2018
 */
public class AppWithoutSpring {
    public static void main(String[] args) {
        Team chemist = new Chemist();
        Team barcelona = new Barcelona();
        Game game = new FootballGame(chemist, barcelona);
        System.out.println(game.playGame());
    }
}
