package ru.bogdanium.kevin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    @Value("Test1")
    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }
}
