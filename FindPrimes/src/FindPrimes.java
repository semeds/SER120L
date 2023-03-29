import java.util.Scanner;

public class FindPrimes {
	  public static boolean isPrime(int num)
      {
          // Assuming the num is >= 2
          if(num == 2)
              return true;
          
          for(int counter=2; counter<= Math.ceil(Math.sqrt(num)); counter++)
          {
              if(num%counter == 0)
                  return false;
          }
          return true;
          
      }
      
      public static void main(String[] args)
      {
          //int firstLimitStart, firstLimitEnd, secondLimitStart, secondLimitEnd;
          // YOUR CODE BELOW
          Scanner input1 = new Scanner(System.in);
          System.out.print("Type the first start limit: ");
          
          int firstLimitStart = input1.nextInt();
          
          Scanner input2 = new Scanner(System.in);
          System.out.print("Type the first end limit: ");
          int firstLimitEnd = input2.nextInt();
          
          Scanner input3 = new Scanner(System.in);
          System.out.print("Type the second start limit: ");
          int secondLimitStart = input3.nextInt();
          
          Scanner input4 = new Scanner(System.in);
          System.out.print("Type the second end limit: ");
          int secondLimitEnd = input4.nextInt();
          
          int firstLimitPrimes = 0;
          for(int start = firstLimitStart; start <= firstLimitEnd; start++){
        	  if((FindPrimes.isPrime(start) == true)){
        		  firstLimitPrimes++;
        	  }
          }
          System.out.printf("The total number of primes between %d and %d is %d\n", firstLimitStart, firstLimitEnd, firstLimitPrimes);
          
          int secondLimitPrimes = 0;
          for(int start = secondLimitStart; start <= secondLimitEnd; start++){
        	  if((FindPrimes.isPrime(start) == true)){
        		  secondLimitPrimes++;
        	  }
          }
          System.out.printf("The total number of primes between %d and %d is %d\n", secondLimitStart, secondLimitEnd, secondLimitPrimes);
          
          
          if(firstLimitPrimes > secondLimitPrimes) {
        	  System.out.println("There are more primes between " + firstLimitStart + " and " + firstLimitEnd);
          }
          else {
        	  System.out.println("There are more primes between " + secondLimitStart + " and " + secondLimitEnd);
          }
          
       
      }

}
