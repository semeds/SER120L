/*
 * Author: Sean Emede
 * File: Temperature.java
 * Date: 2/21/2023
 * Purpose: to create a class to check is certain substances are boiling freezing at a given temperature
 */
public class Temperature {
	
	//instance variables
	private double temperature;
	
	//constructors
	public Temperature() {
		this.temperature = 0.0;
	}
	
	public Temperature(double temperature) {
		this.temperature = temperature;
	}
	
	//accessors and mutators
	public double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	//other methods to check if given temperature is boiling/freezing
	public boolean isEthylFreezing() {
		return temperature <= -173.0;
	}
	
	public boolean isEthylBoiling() {
		return temperature >= 172.0;
	}
	
	public boolean isOxygenFreezing() {
		return temperature <= -362.0;
	}
	
	public boolean isOxygenBoiling() {
		return temperature >= -306.0;
	}
	
	public boolean isWaterFreezing() {
		return temperature <= 32.0;
	}
	
	public boolean isWaterBoiling() {
		return temperature >= 212.0;
	}

}
