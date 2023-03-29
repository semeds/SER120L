import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSort {

	public static SecureRandom random = new SecureRandom();
	public static final int ARRAY_SIZE = 10;

	public static void main(String[] args){

		int [] elements = new int[ARRAY_SIZE];

		for(int index = 0; index < elements.length; index++){ //produces an array of randoms numbers with range from 0 to 1999
			
			elements[index] = random.nextInt(2000);

		}
		System.out.println("Original array ==> " + Arrays.toString(elements));


		for(int index1 = 0; index1 < elements.length-1; index1++){

			for(int index2 = 0; index2 < elements.length - index1 - 1; index2++){

				if(elements[index2] > elements[index2 + 1]){

					int temp = elements[index2];
					elements[index2] = elements[index2 + 1];
					elements[index2 + 1] = temp;

				}
				

			}
			System.out.println(Arrays.toString(elements));

		}

		//System.out.println(Arrays.toString(elements));

	}
	
}
