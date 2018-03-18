package com.pluralsight.repository;

import com.pluralsight.model.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RideRepositoryImpl implements RideRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Ride> getRides() {
        Ride ride = new Ride();
        ride.setName("Dankov Canyon");
        ride.setDuration(17);
        List<Ride> rides = new ArrayList<>();
        rides.add(ride);
        return rides;
    }
}
