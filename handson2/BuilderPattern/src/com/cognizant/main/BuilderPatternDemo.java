package com.cognizant.main;

import com.cognizant.meal.Meal;
import com.cognizant.meal.MealBuilder;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
		
		System.out.println("Non Veg Meal");
		
		nonvegMeal.showItems();
		
		System.out.println("Total Cost: " + nonvegMeal.getCost());
		
        Meal vegMealC = mealBuilder.prepareVegMealC();
		
		System.out.println("Veg Meal Combo");
		
		vegMealC.showItems();
		
		System.out.println("Total Cost: " + vegMealC.getCost());
		
        Meal nonvegMealC = mealBuilder.prepareNonVegMealC();
		
		System.out.println("Non Veg Meal Combo");
		
		nonvegMealC.showItems();
		
		System.out.println("Total Cost: " + nonvegMealC.getCost());
	}

}
