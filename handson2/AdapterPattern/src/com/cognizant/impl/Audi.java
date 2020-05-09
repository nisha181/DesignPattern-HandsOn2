package com.cognizant.impl;

import com.cognizant.interfaces.Movable;

public class Audi implements Movable { 
	@Override 
	public double getSpeed() { 
		return 265;
	}

	@Override
	public double getPrice() {
		return 20000;
	}
}
