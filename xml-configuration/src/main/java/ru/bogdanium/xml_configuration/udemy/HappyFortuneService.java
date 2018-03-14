package ru.bogdanium.xml_configuration.udemy;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Be happy.";
    }
}
