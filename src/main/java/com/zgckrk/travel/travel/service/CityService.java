package com.zgckrk.travel.travel.service;

import com.zgckrk.travel.travel.entity.City;
import com.zgckrk.travel.travel.springData.CitySpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    CitySpringDataRepository cityRepository;

    public CityService(CitySpringDataRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City createCity(String name){
        return cityRepository.save(new City(name));
    }

    public List<City> listAllCities(){
        return cityRepository.findAll();
    }
}
