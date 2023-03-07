/*
  * Author: Sean Emede
 * File: MainCircle.java
 * Date: 2/21/2023
 * Purpose: to find the area of a circle from array values and user input and print the value
 */

import java.util.Scanner;

public class MainCircle {

	public static void main(String[] args) {
		
		//to get circle radius and area from user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		double radius = input.nextDouble();
		
		Circle circle = new Circle(radius);
		System.out.println("Area for the circle is " + circle.getArea()+"\n");
		
		//to get the circle area from the array values
		Circle[] knownRadius = new Circle[5]; //declaring the array
		knownRadius[0] = new Circle(12);
		knownRadius[1] = new Circle(7);
		knownRadius[2] = new Circle(9);
		knownRadius[3] = new Circle(14);
		knownRadius[4] = new Circle(18);
		
		//for loop to print out the area for each circle
		for (int counter = 0; counter < knownRadius.length; counter++) {
			System.out.println("Area for the circle is " + knownRadius[counter].getArea());
		}
	}

}
