package com.zgckrk.travel.travel.controller;

import com.zgckrk.travel.travel.entity.Place;
import com.zgckrk.travel.travel.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    //http://localhost:8080/cities/places?cityName=Milan
    @GetMapping("/cities/places")
    public List<Place> listPlacesByCity(@RequestParam String cityName){
        return placeService.listPlacesByCity(cityName);
    }
}
