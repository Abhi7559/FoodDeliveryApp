package com.foodapp.Servlets;

import java.io.IOException;
import java.util.List;

import com.foodapp.DAO.RestaurantDAO;
import com.foodapp.DAOImpl.RestaurantDAOImpl;
import com.foodapp.models.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Hi from home servlet");
			
			RestaurantDAO rdao = new RestaurantDAOImpl();
			
			List<Restaurant> allRestaurants = rdao.getAllRestaurants();
			
			req.setAttribute("allRestaurants", allRestaurants);
			
			for(Restaurant restaurant : allRestaurants) {
				System.out.println(restaurant);
			}
			
			RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
			
			rd.forward(req, resp);
	}
}
