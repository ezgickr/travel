package com.zgckrk.travel.travel.controller;

import com.zgckrk.travel.travel.entity.City;
import com.zgckrk.travel.travel.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CityController {

    @Autowired
    CityService cityService;

    @GetMapping("/cities")
    public List<City> getAllCities(){
        return cityService.listAllCities();
    }
}
