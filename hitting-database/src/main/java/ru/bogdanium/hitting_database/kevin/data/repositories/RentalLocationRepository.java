package ru.bogdanium.hitting_database.kevin.data.repositories;

import ru.bogdanium.hitting_database.kevin.data.entities.RentalLocation;

import java.util.List;

public interface RentalLocationRepository extends Repo<RentalLocation> {

    public String findNameById(Integer id);

    public List<RentalLocation> findLocationsByState(String state);
}
