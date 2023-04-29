/*
 * author: Ryan Sliger
 * description: find the square root of all elements in an array
 * date: April 21
 */

package testpackage1;

public class NElements {
    private static final int N = 10; // Replace with your desired value

    public static void main(String[] args) {
        double[] arr = new double[N]; // Create a new double array with length N
        try {
            // Fill the array with square roots of the integers from 0 to N-1
            for (int counter = 0; counter < N; counter++) {
                arr[counter] = Math.sqrt(counter);
            }
        } catch (Exception e) {
            // If an exception is caught, print an error message and stack trace
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        // Print out each element in the array
        for (double sqrt : arr){
            System.out.println(sqrt);
        }
    }
}
