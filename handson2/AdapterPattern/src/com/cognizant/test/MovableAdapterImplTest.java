package com.cognizant.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cognizant.impl.Audi;
import com.cognizant.impl.BugattiVeyron;
import com.cognizant.impl.MovableAdapterImpl;
import com.cognizant.interfaces.Movable;
import com.cognizant.interfaces.MovableAdapter;

public class MovableAdapterImplTest {
	
	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getPrice(),9200.00000 , 0.00001);
	}
	
	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted1() { 
		Movable audi = new Audi();
		MovableAdapter audiAdapter = new MovableAdapterImpl(audi); 
		assertEquals(audiAdapter.getSpeed(), 426.475100, 0.00001);
	}
	
	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted1() {
		Movable audi = new Audi();
		MovableAdapter audiAdapter = new MovableAdapterImpl(audi); 
		assertEquals(audiAdapter.getPrice(),18400.00000 , 0.00001);
	}

}
