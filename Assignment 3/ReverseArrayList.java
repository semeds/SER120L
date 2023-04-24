/*
 * Author: Sean Emede
 * Description: Reverses an array list on integers or strings
 * Date: 04/21/2023
 */
import java.util.ArrayList;

public class ReverseArrayList{

	//method that reverses the array elements
    public static void reverseArr(ArrayList<Integer> list) {
        //for loop to go through first half of the list
        for (int i = 0; i < list.size() / 2; i++) {
            // stores the element at current index in a temporary variable
            int temp = list.get(i);

            // element at current index is removed
            list.remove(i);

            //element is added to the list at corresponding index
            list.add(i, list.get(list.size() - 1 - i));

            // removes element at the corresponding index at the beginning of the ArrayList
            list.remove(list.size() - 1 - i);

            //adds the temporary variable at the corresponding index at the beginning of the ArrayList
            list.add(list.size() - i, temp);
        }
    }

	public static void main(String[] args) {
        // reating a new ArrayList of Int object then add some elements to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(1);
        list.add(0);
		list.add(5);

        //prints original list
        System.out.println("Original list: " + list);

        //reverses lists
        reverseArr(list);

        //prints reversed list
        System.out.println("Reversed list: " + list);
    }
}