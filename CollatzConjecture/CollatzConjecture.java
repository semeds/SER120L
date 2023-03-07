import java.util.Scanner;

public class CollatzConjecture {

    public static boolean isPrime(int num){ //method to find if the number is prime
        if(num == 1 || num == 2)
            return true;
        
        for(int counter = 2; counter <= Math.ceil(Math.sqrt(num)); counter++){ 
            if(num%counter == 0)
                return false;

        }
        return true; //exit here; means the number is prime
        
    }

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Hey! Enter a num larger than 2:");
        int num = input.nextInt();

        int primeCount = 0;
        int steps = 0;


        while(true){
            if(num%2 == 0){ //when the number is even
                num /= 2;
            }
            else{
                if(CollatzConjecture.isPrime(num)) //to find and count if the current number is prime
                    primeCount++;
                num = 3*num + 1; //when number is odd
            }
            steps++;

            if (num == 1){
                System.out.println("1");
                break;
            }
            System.out.println("->"); //outside; prints only when going to next step
        }
        System.out.println(); 
        System.out.println("Number of primes encountered: " + primeCount);
        System.out.println("Total steps taken: " + steps);

    }





}   
