package com.spring.model;

import java.util.Arrays;
import java.util.List;
import com.spring.pojo.Food;
import org.springframework.stereotype.Component;

@Component
public class OrderModel implements IOrderModel{

	@Override
	public List<Food> getFoodList() {
		
		return Arrays.asList(
				new Food("Briyani",200,1),
				new Food("Veg Meals",120,2),
				new Food("Chicken rice",90,3),
				new Food("Grill",150,4),
				new Food("Dosa",30,5),
				new Food("Porota",20,6),
				new Food("Country Mutton",140,7));
	}

	
}
