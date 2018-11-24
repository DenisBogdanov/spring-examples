package ru.bogdanium.entity;

/**
 * Denis, 24.11.2018
 */
public class Spartak implements Team {

    @Override
    public String getName() {
        return "Spartak";
    }

    @Override
    public String toString() {
        return getName();
    }
}
