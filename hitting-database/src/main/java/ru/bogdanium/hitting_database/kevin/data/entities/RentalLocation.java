package ru.bogdanium.hitting_database.kevin.data.entities;

import java.util.ArrayList;
import java.util.List;

public class RentalLocation {

    private Integer rentalLocationId;

    private String name;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String postalCode;

    private List<Media> media = new ArrayList<>();

    public Integer getRentalLocationId() {
        return rentalLocationId;
    }

    public void setRentalLocationId(Integer rentalLocationId) {
        this.rentalLocationId = rentalLocationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "RentalLocation{" +
                "rentalLocationId=" + rentalLocationId +
                ", name='" + name + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
