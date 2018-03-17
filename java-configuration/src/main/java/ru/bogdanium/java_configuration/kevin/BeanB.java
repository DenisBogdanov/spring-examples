package ru.bogdanium.java_configuration.kevin;

import org.springframework.beans.factory.annotation.Value;

public class BeanB {

    @Value("Hello")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
