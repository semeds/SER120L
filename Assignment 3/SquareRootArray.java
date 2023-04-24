/*
 * Author: Sean Emede
 * Description: prints the square root of each index in the array
 * Date: 04/21/2023
 */
public class SquareRootArray {
	private static final int N = 12; // number of desired elements in the array

    public static void main(String[] args) {
        double arr[] = new double[N]; // Create a new double array with length N
        try {
            // Fill the array with square roots of the integers from 0 to N-1
            for (int counter = 0; counter < N; counter++) {
                arr[counter] = Math.sqrt(counter);
            }
        } catch (Exception e) {
            // If an exception is caught, an error message and stack trace are printed out
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        //print out array's elements
        for (double sqrt : arr){
            System.out.println(sqrt);
        }
    }
}
