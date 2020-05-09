package com.cognizant.implement;

import com.cognizant.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
