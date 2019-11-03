package com.zgckrk.travel.travel.springData;

import com.zgckrk.travel.travel.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitySpringDataRepository extends JpaRepository<City,Long> {

    City findByName(String name);
}
