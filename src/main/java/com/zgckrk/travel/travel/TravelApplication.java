package com.zgckrk.travel.travel;

import com.zgckrk.travel.travel.entity.Place;
import com.zgckrk.travel.travel.entity.User;
import com.zgckrk.travel.travel.service.CityService;
import com.zgckrk.travel.travel.service.PlaceService;
import com.zgckrk.travel.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class TravelApplication implements CommandLineRunner {

	@Autowired
	CityService cityService;

	@Autowired
	PlaceService placeService;

	@Autowired
	UserService userService;

	public static void main(String[] args) {

	    SpringApplication.run(TravelApplication.class, args);
	}

    @Override
	public void run(String... args) throws Exception{
		insertCities();
		insertPlaces();
		insertUser();
        addPlaceToUser();
	}

	public void insertCities(){
		cityService.createCity("Milan");
		cityService.createCity("Florence");
		cityService.createCity("Rome");
		cityService.createCity("İstanbul");
	}

	public void insertPlaces(){
		placeService.createPlace("Spanish Steps","Rome");
		placeService.createPlace("Piazza Navona","Rome");
		placeService.createPlace("Trevi Fountain","Rome");
		placeService.createPlace("The Colosseo","Rome");
		placeService.createPlace("Imperial Forums","Rome");
		placeService.createPlace("Milan Cathedral","Milan");
		placeService.createPlace("Leonardo da Vinci's Last Supper","Milan");
		placeService.createPlace("Castello Sforzesco","Milan");
		placeService.createPlace("San Maurizio and the Archaeology Museum","Milan");
		placeService.createPlace("Hagia Sophia","İstanbul");
		placeService.createPlace("Topkapı Palace ","İstanbul");
		placeService.createPlace("Süleymaniye Mosque","İstanbul");
		placeService.createPlace("Sultanahmet Square","İstanbul");
		placeService.createPlace("Basilica Cistern","İstanbul");
		placeService.createPlace("Grand Bazaar","İstanbul");


	}

	public void insertUser(){
	    userService.createUser("Sally","1234");
	    userService.createUser("Dolly","2345");
	    userService.createUser("Cat","3456");
    }

    public  void addPlaceToUser(){
        ArrayList<Place> places = new ArrayList<>();
        Place place = new Place();
        place.setId(new Long(1));
        places.add(place);
        Long userId= new Long(1);
        userService.addPlaceToUser(userId,places);
    }

}
