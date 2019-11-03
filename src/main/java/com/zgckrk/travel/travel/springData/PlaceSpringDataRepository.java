package com.zgckrk.travel.travel.springData;

import com.zgckrk.travel.travel.entity.City;
import com.zgckrk.travel.travel.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceSpringDataRepository extends JpaRepository<Place,Long> {

    List<Place> findByCity(City city);
}
