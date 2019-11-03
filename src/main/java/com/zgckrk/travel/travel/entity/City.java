package com.zgckrk.travel.travel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private Set<Place> placeSet;

    public City(String name) {
        this.name = name;
    }

    public City(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Place> getPlaceSet() {
        return placeSet;
    }

    public void setPlaceSet(Set<Place> placeSet) {
        this.placeSet = placeSet;
    }
}
