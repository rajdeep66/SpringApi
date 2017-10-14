package com.stackroute.foodie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Foodie")
public class FoodieModel {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String restauranName;
//	private String RestaurantAddress;
//	private float CostOfTwo;
//	private String ImageLink;
//	public String getRestauranName() {
//		return RestauranName;
//	}
//	public void setRestauranName(String restauranName) {
//		RestauranName = restauranName;
//	}
//	public String getRestaurantAddress() {
//		return RestaurantAddress;
//	}
//	public void setRestaurantAddress(String restaurantAddress) {
//		RestaurantAddress = restaurantAddress;
//	}
//	public float getCostOfTwo() {
//		return CostOfTwo;
//	}
//	public void setCostOfTwo(float costOfTwo) {
//		CostOfTwo = costOfTwo;
//	}
//	public String getImageLink() {
//		return ImageLink;
//	}
//	public void setImageLink(String imageLink) {
//		ImageLink = imageLink;
//	}

	public String getRestaurantId() {
		return id;
	}

	public void setRestaurantId(String id) {
		this.id = id;
	}

	public String getRestauranName() {
		return restauranName;
	}

	public void setRestauranName(String restauranName) {
		this.restauranName = restauranName;
	}

	
//
//	public FoodieModel(long restaurantId, String restauranName) {
//		super();
//		this.restaurantId = restaurantId;
//		this.restauranName = restauranName;
//	}
//
//	public FoodieModel() {
//		super();
//		
//	}

	
	
	
	
	
	
	
	
	

}
