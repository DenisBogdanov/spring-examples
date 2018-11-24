package ru.bogdanium.message;

/**
 * Denis, 30.09.2018
 */
public class SimpleMessageServiceImpl implements MessageService {

    private String message;

    public SimpleMessageServiceImpl() {
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
