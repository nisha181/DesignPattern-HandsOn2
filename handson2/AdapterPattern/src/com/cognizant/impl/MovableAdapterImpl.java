package com.cognizant.impl;

import com.cognizant.interfaces.Movable;
import com.cognizant.interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter { 
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars=luxuryCars;
	}
	
	
	// standard constructors 
	@Override 
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed()); 
    } 
	
	@Override
	public double getPrice() {
		return convertUSDtoEuro(luxuryCars.getPrice());
	}
	private double convertUSDtoEuro(double usd) {
		return usd*0.92;
	}
	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934; 
	}
	
}
