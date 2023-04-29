/*
 * author: Ryan Sliger
 * description: find all the pythagreon tripples up to n=500
 * date: April 21
 */

package testpackage1;

public class PythagoreanTriples {
    public static void main(String[] args) {
        // Print the column headers
        System.out.printf("%-10s%-10s%-10s%n", "Side 1", "Side 2", "Hypotenuse");
        // Print a separator line
        System.out.println("-------------------------------------");
        
        // Loop through all possible values for Side 1
        for (int side1 = 1; side1 <= 500; side1++) {
            // Loop through all possible values for Side 2
            for (int side2 = 1; side2 <= 500; side2++) {
                // Loop through all possible values for the Hypotenuse
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    // Check if the current values of Side 1, Side 2, and Hypotenuse form a Pythagorean Triple
                    if (side1*side1 + side2*side2 == hypotenuse*hypotenuse) {
                        // If they do, print them out
                        System.out.printf("%-10d%-10d%-10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}