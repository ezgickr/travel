package com.zgckrk.travel.travel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToOne
    private City city;

    @JsonIgnore
    @ManyToMany(mappedBy = "visitedPlaces", fetch = FetchType.LAZY)
    private Set<User> userList=new HashSet<>();

    public Place(){}

    public Place(String name, City city) {
        this.name = name;
        this.city = city;
    }

}
