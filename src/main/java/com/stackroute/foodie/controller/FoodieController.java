package com.stackroute.foodie.controller;



import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.stackroute.foodie.model.FoodieModel;



import com.stackroute.foodie.service.FoodieService;
import com.stackroute.foodie.service.FoodieServiceWithDb;

@RestController
@RequestMapping("/v0.1/FoodieService")
public class FoodieController {
	
	
	@Autowired
	FoodieService foodieService; 
	
	
	
	@RequestMapping (value="/Foodie",method=RequestMethod.GET)
	public ResponseEntity getAllRestaurant() {
		return new ResponseEntity<ArrayList<FoodieModel>>(foodieService.getAllRestaurant(), HttpStatus.OK) ;
		}
//	@RequestMapping (value="/Foodie/{id}",method=RequestMethod.GET)
//	@ResponseBody
//	public ResponseEntity getRestaurantById(@PathVariable("id")int Id) {
//		return new ResponseEntity<FoodieModel>(foodieService.getRestaurantById(Id), HttpStatus.OK) ;
//		}
	
	@PostMapping(value="/Foodie",consumes = "application/json")
	public ResponseEntity saveRestaurant(@RequestBody FoodieModel restaurentDetail) {
			
		foodieService.addRestaurant(restaurentDetail);
     return new ResponseEntity<String> ("yes done",HttpStatus.OK);
    
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Foodie/{restaurantId}", consumes="application/json")
    public ResponseEntity<String> delete(@PathVariable(value="restaurantId") String restaurantId)
    {
        /*Add validation code*/        
         foodieService.deleteRestaurant(restaurantId);
        return new ResponseEntity<String>("Deleted succesfully", HttpStatus.OK) ;
        
    }



//
//	@RequestMapping(value="/Foodie",method=RequestMethod.DELETE,consumes = "application/json")
//	public ResponseEntity  deleteRestaurant(@RequestBody int restaurantId) {
//		
//		
////		foodieService.getRestaurantById(restaurantId);
//		
//		
//		foodieService.deleteRestaurant(foodieService.getRestaurantById(restaurantId));
//		
//		return new ResponseEntity<String> ("yes done",HttpStatus.OK);
//	}
//	
	
	
	
	
}
