package ru.bogdanium.entity;

import org.springframework.stereotype.Component;

/**
 * Denis, 24.11.2018
 */
@Component
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
