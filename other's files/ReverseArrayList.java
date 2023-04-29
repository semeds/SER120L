/*
 * author: Ryan Sliger
 * description: reverse the order of an array list
 * date: April 21
 */

package testpackage1;
import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create a new ArrayList of Strings and add some elements to it
        ArrayList<String> list = new ArrayList<>();
        list.add("Baseball");
        list.add("Soccer");
        list.add("Football");
        list.add("Hockey");
        list.add("Basketball");

        // Print out the original list
        System.out.println("Original list: " + list);

        // Reverse the list
        reverse(list);

        // Print out the reversed list
        System.out.println("Reversed list: " + list);
    }

    // Method to reverse an ArrayList of Strings
    public static void reverse(ArrayList<String> list) {
        // Loop through the first half of the ArrayList
        for (int i = 0; i < list.size() / 2; i++) {
            // Store the element at the current index in a temporary variable
            String temp = list.get(i);

            // Remove the element at the current index
            list.remove(i);

            // Add the element at the corresponding index at the end of the ArrayList
            list.add(i, list.get(list.size() - 1 - i));

            // Remove the element at the corresponding index at the beginning of the ArrayList
            list.remove(list.size() - 1 - i);

            // Add the temporary variable at the corresponding index at the beginning of the ArrayList
            list.add(list.size() - i, temp);
        }
    }

}
