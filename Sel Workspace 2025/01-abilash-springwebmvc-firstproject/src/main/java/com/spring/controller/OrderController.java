package com.spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.spring.model.IOrderModel;
import com.spring.pojo.Food;


@Controller
public class OrderController {

	@Autowired
	IOrderModel foodData;
	
	@RequestMapping("/foodhome")
	public String foodHomePage(Model model) {
		
		List<Food> foodList = foodData.getFoodList();
		System.out.println("food List : " + foodList);
		 model.addAttribute("foodList", foodList);

		 return "home";
	}
	
	
	@RequestMapping("/process-order")
	public String processOrder(@RequestParam("selectedFoods") List<Integer> selectedIds,Model model) {
		
		List<Food> foodList = foodData.getFoodList();

		List<Food> selectedFoodList = foodList
										.stream()
										.filter(food -> {
											return selectedIds
														.stream()
														.anyMatch(id -> food.getId() == id);
										}).toList();
		
		System.out.println("Selected Food List : " + selectedFoodList);
		
		
		model.addAttribute("selectedFoods",selectedFoodList);
		
		 return "sucess";
		
	}
	
}
