/*
 * Author: Sean Emede
 * Description: Goes through numbers 1-500 looking for integers that give Pythagorean Triples
 * Date: 04/21/2023
 */
public class PythagoreanTriple {
	
	public static void main (String [] args){
		
		//prints table headers
		System.out.printf("%-10s%-10s%-10s%n", "side 1", "side 2", "hypotenuse");
		System.out.println("________________________________________________");

		//nested for loop to go through all possible values for a, b and c
		for (int side1  = 1; side1 <= 500; side1++){
			for (int side2 = side1; side2 <= 500; side2++){
				for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++){
					//checks if the the integer values are correct for a pythagorean triple
					if(side1*side1 + side2*side2 == hypotenuse*hypotenuse){
						// prints triple in the table
						System.out.printf("%-10d%-10d%-10d%n", side1, side2, hypotenuse);
					}
				}
			}
		}

	}
}
