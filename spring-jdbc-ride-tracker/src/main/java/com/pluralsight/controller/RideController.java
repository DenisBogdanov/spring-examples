package com.pluralsight.controller;

import com.pluralsight.model.Ride;
import com.pluralsight.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RideController {

    @Autowired
    private RideService rideService;

    @RequestMapping(value = "/rides", method = RequestMethod.GET)
    @ResponseBody
    public List<Ride> getRides() {
        return rideService.getRides();
    }
}
