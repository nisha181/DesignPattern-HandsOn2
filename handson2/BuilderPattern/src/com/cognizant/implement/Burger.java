package com.cognizant.implement;

import com.cognizant.interfaces.Item;
import com.cognizant.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
