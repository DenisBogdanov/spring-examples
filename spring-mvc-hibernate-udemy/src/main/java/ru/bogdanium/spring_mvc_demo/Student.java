package ru.bogdanium.spring_mvc_demo;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String favoriteLanguage;

    private String[] operatingSystems;

    private LinkedHashMap<String, String> countries;

    public Student() {

        countries = new LinkedHashMap<>();

        countries.put("RU", "Russia");
        countries.put("US", "USA");
        countries.put("BR", "Brazil");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getCountries() {
        return countries;
    }
}
