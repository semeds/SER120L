/*
 * Author: Sean Emede
 * File: Temperature.java
 * Date: 2/21/2023
 * Purpose: to test the Temperature.java file. Prints out whether a user input has
 * 			certain substances boiling/freezing at that temperature
 */

import java.util.Scanner;

public class MainTemperature {

	public static void main(String[] args) {
		
		//to prompt and take user input
		System.out.println("Enter a temperature so we can check it:");
		Scanner input = new Scanner(System.in);
		int tempIn = input.nextInt();
		
		Temperature temp = new Temperature(tempIn);
		System.out.println("\n");
		//prints the temperature we want to check
        System.out.println("The temperature given is " + temp.getTemperature()); 
        //prints whether the substances are boiling/freezing at given temperature
        System.out.println("Is ethyl alcohol freezing at this temperature?? " + temp.isEthylFreezing());
        System.out.println("Is ethyl alcohol boiling at this temperature?? " + temp.isEthylBoiling());
        System.out.println("Is oxygen freezing at this temperature? " + temp.isOxygenFreezing());
        System.out.println("Is oxygen boiling at this temperature?? " + temp.isOxygenBoiling());
        System.out.println("Is water freezing at this temperature?? " + temp.isWaterFreezing());
        System.out.println("Is water boilig at this temperature?? " + temp.isWaterBoiling());
		
		

	}

}
