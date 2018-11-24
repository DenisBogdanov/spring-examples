package ru.bogdanium.entity;

/**
 * Denis, 24.11.2018
 */
public class Chemist implements Team {

    @Override
    public String getName() {
        return "Chemist";
    }

    @Override
    public String toString() {
        return getName();
    }
}
