package com.cognizant.impl;

import com.cognizant.interfaces.Movable;

public class BugattiVeyron implements Movable { 
	@Override 
	public double getSpeed() { 
		return 268;
	}

	@Override
	public double getPrice() {
		return 10000;
	}
}
