package ru.bogdanium.message;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Denis, 30.09.2018
 */
public class RandomServiceMessageImpl implements MessageService {

    private String[] messages = new String[]{
            "Sunday",
            "Just another Monday",
            "Hello Tuesday",
            "No more Wednesday",
            "Oh Thursday",
            "I've been waiting for you",
            "Saturday"
    };

    @Override
    public String getMessage() {
        int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
        return messages[day - 1];
    }
}
