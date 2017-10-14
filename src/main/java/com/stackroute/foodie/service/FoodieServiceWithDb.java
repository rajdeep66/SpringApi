package com.stackroute.foodie.service;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stackroute.foodie.model.FoodieModel;
import com.stackroute.foodie.repository.FoodieRdbmRepository;

@Service
public class FoodieServiceWithDb implements FoodieService {
	@Autowired
	FoodieRdbmRepository foodieRdbmRepository;
	
	@Override
	public ArrayList<FoodieModel> getAllRestaurant() {
		return (ArrayList<FoodieModel>) foodieRdbmRepository.findAll();
	}

	@Override
	public int addRestaurant(FoodieModel restaurant) {
		foodieRdbmRepository.save(restaurant);
    return 1;
	}



	@Override
	public String deleteRestaurant(String restaurantId) {
		// TODO Auto-generated method stub
		foodieRdbmRepository.delete(restaurantId);
		System.out.println("delete is running..");
		return null;
	}



	

	
	}
	

