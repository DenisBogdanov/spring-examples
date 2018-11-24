package ru.bogdanium.entity;

import org.springframework.stereotype.Component;

/**
 * Denis, 24.11.2018
 */
@Component
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
