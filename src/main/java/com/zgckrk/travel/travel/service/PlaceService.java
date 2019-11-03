package com.zgckrk.travel.travel.service;

import com.zgckrk.travel.travel.entity.City;
import com.zgckrk.travel.travel.entity.Place;
import com.zgckrk.travel.travel.springData.CitySpringDataRepository;
import com.zgckrk.travel.travel.springData.PlaceSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    PlaceSpringDataRepository placeRepository;
    CitySpringDataRepository cityRepository;

    @Autowired
    public PlaceService(PlaceSpringDataRepository placeRepository, CitySpringDataRepository cityRepository) {
        this.placeRepository = placeRepository;
        this.cityRepository = cityRepository;
    }

    public Place createPlace(String name, String cityName){
        City cityFound = cityRepository.findByName(cityName);
        return  placeRepository.save(new Place(name,cityFound));
    }

    public List<Place>  listPlacesByCity(String cityName){
        City city = cityRepository.findByName(cityName);
        return placeRepository.findByCity(city);
    }
}
