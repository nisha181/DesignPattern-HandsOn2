package com.cognizant.implement;

import com.cognizant.interfaces.Item;
import com.cognizant.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
