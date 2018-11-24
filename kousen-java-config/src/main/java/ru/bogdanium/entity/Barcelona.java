package ru.bogdanium.entity;

/**
 * Denis, 24.11.2018
 */
public class Barcelona implements Team {

    @Override
    public String getName() {
        return "Barcelona";
    }

    @Override
    public String toString() {
        return getName();
    }
}
