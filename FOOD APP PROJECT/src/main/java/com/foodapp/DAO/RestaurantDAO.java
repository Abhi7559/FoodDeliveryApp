package com.foodapp.DAO;

import java.util.List;
import com.foodapp.models.Restaurant;

public interface RestaurantDAO {
	void addRestaurant(Restaurant restaurant);
	void updateRestaurant(Restaurant restaurant);
	void deleteRestaurant(int restaurantid);
	Restaurant getRestaurantById(int restaurantid);
	List<Restaurant> getAllRestaurants();
	List<Restaurant> searchRestaurants(String query);	
}