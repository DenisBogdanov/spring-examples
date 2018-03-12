package ru.bogdaniium.xml_configuration.udemy;

public interface Coach {
    String getDailyWorkout();
    String getDailyFortune();
    String getTeam();
    void postInit();
    void preDestroy();
}
