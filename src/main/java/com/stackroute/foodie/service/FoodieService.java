package com.stackroute.foodie.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stackroute.foodie.model.FoodieModel;

@Component
public interface FoodieService {
	
	 public ArrayList<FoodieModel> getAllRestaurant( );
	 public int addRestaurant(FoodieModel restaurant);
	 public String deleteRestaurant(String restaurantId);	
//	 public FoodieModel getRestaurantById(int Id);

}





/*package com.stackroute.foodie.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.stackroute.foodie.model.FoodieModel;

@Service
public class FoodieService {
//bellow data will be coming from database now we are hard coding them 
	ArrayList<FoodieModel> resultList = new ArrayList<>(Arrays.asList(
    new FoodieModel(200,"Dominos"),
    new FoodieModel(201,"mec"),
    new FoodieModel(202,"habib"))
);
	   
	   public ArrayList<FoodieModel> getAllRestaurant( )
	   {
	       return resultList;
	   }
	   

	   public void addRestaurant(FoodieModel restaurant)
	   {
	       resultList.add(restaurant);
	   }
	   
	   
	   
	   
	   
	   public void deleteRestaurant(FoodieModel restaurant)
	   {
	       resultList.remove(restaurant);
	   }
	}
	
	*/

