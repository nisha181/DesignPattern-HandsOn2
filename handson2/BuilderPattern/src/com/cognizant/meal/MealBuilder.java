package com.cognizant.meal;

import com.cognizant.implement.ChickenBurger;
import com.cognizant.implement.Coke;
import com.cognizant.implement.Pepsi;
import com.cognizant.implement.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {

		Meal meal = new Meal();

		meal.addItem(new VegBurger());

		meal.addItem(new Coke());

		return meal;

	}

	public Meal prepareNonVegMeal() {

		Meal meal = new Meal();

		meal.addItem(new ChickenBurger());

		meal.addItem(new Pepsi());

		return meal;

	}
	
	public Meal prepareVegMealC() {

		Meal meal = new Meal();

		meal.addItem(new VegBurger());

		meal.addItem(new Pepsi());

		return meal;

	}
	
	public Meal prepareNonVegMealC() {

		Meal meal = new Meal();

		meal.addItem(new ChickenBurger());

		meal.addItem(new Coke());

		return meal;

	}

}
