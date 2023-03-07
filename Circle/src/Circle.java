/*
 * Author: Sean Emede
 * File: Circle.java
 * Date: 2/21/2023
 * Purpose: to find the area of a circle with a given radius
 */
import java.lang.Math;

public class Circle {
	
	//instance variables
	private double radius;
	private static final double pi = Math.PI;
	
	//default constructor
	public Circle () {
		this.radius = 0.0;
	}
	
	//overloaded constructor for specified radius
	public Circle (double radius) {
		this.radius = radius;		
	}
	
	//accessors and mutators for radius
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//method to get area of circle
	public double getArea() {
		return pi * radius * radius;
	}
}
