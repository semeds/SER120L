import java.util.Scanner;

public class Series1 {
	
	public static long factorial(int num) {
		
		long fact = 1;
		
		for(int count = 1; count <= num; count++) { //factorial thingy
			fact = fact*count;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hey! Enter x:");
		int x = input.nextInt();
		System.out.flush(); //clears sumn idk
		System.out.println("Enter n:");
		int n = input.nextInt();
		
		double currentTerm = 1;
		double result = 1;
		for(int count = 1; count < n; count++) {
			currentTerm = Math.pow(x, count)/Series1.factorial(count); //x is base, count is the power
			result = result + currentTerm;
		}
		
		System.out.println("Result is: " + result);
	}

}
