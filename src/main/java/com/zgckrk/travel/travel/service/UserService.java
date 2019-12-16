package com.zgckrk.travel.travel.service;

import com.zgckrk.travel.travel.entity.Place;
import com.zgckrk.travel.travel.entity.User;
import com.zgckrk.travel.travel.springData.CitySpringDataRepository;
import com.zgckrk.travel.travel.springData.PlaceSpringDataRepository;
import com.zgckrk.travel.travel.springData.UserSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    UserSpringDataRepository userRepository;

    @Autowired
    CitySpringDataRepository cityRepository;

    @Autowired
    PlaceSpringDataRepository placeRepository;


    public User createUser(String userName, String password) {
        User user = new User(userName, password);
        return userRepository.save(user);
    }

    @Transactional
    public User addPlaceToUser(Long userId, ArrayList<Place> places) {
        User foundUser = userRepository.findById(userId).orElse(null);
        Place foundPlace;
        Set<Place> placeSet = new HashSet<>();
        for (Place place: places ) {
            foundPlace = placeRepository.findById(place.getId()).orElse(null);
            placeSet.add(foundPlace);
        }
        foundUser.setVisitedPlaces(placeSet);
        return userRepository.save(foundUser);
    }
}
