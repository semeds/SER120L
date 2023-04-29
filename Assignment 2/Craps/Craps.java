/*
 * Author: Sean Emede
 * File: Craps.java
 * Date: 3/9/2023
 * Purpose: to simulate a game of craps 1 million times, and print out statistics concerning the game
 * 			
 */
import java.security.SecureRandom;

public class Craps 
{
   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();

   // enum type with constants that represent the game status
   private static enum Status {CONTINUE, WON, LOST};                

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;      
   private static final int SEVEN = 7;     
   private static final int YO_LEVEN = 11; 
   private static final int BOX_CARS = 12; 

   // plays one game of craps
   public static void main(String[] args) throws InterruptedException 
   {
    
	// wins and losses depending on the amount of rolls
	int win1 = 0, win2 = 0, win3 = 0, win4 = 0, win5 = 0, win6 = 0, win7 = 0, win8 = 0, win9 = 0, win10 = 0; 
	int loss1 = 0, loss2 = 0, loss3 = 0, loss4 = 0, loss5 = 0, loss6 = 0, loss7 = 0, loss8 = 0, loss9 = 0, loss10 = 0;
	int moreThan10Rolls = 0;
	int lessThan10Rolls = 0;
	int totalRolls = 0;


	for(int counter = 1; counter < 1000001; counter++)
	{
		int countRolls = 0;
		//System.out.println("Game# " + counter);
	int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int sumOfDice = rollDice(); // first roll of the dice
	  countRolls++;
	  totalRolls++;

	
      // determine game status and point based on first roll 
      switch (sumOfDice) 
      {
         case SEVEN: // win with 7 on first roll    
         case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
			win1++;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll      
         case BOX_CARS: // lose with 12 on first roll 
            gameStatus = Status.LOST;
			loss1++;
            break;
         default: // did not win or lose, so remember point  
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point       
            break; 
      }
	  

      // while game is not complete
      while (gameStatus == Status.CONTINUE) 
      { // not WON or LOST
         sumOfDice = rollDice(); // roll dice again
		 countRolls++;
		 totalRolls++;

         // determine game status
         if (sumOfDice == myPoint) 
         { // win by making point
            gameStatus = Status.WON;
			switch(countRolls) //to count rolls and add to corresponding variable
			{
				case 2:
					win2++;
					break;
				case 3:
					win3++;
					break;
				case 4:
					win4++;
					break;
				case 5:
					win5++;
					break;
				case 6:
					win6++;
					break;
				case 7:
					win7++;
					break;
				case 8:
					win8++;
					break;
				case 9:
					win9++;
					break;
				case 10:
					win10++;
					break;
				default:
					moreThan10Rolls++;
			} 
         } 
         else 
         { 
            if (sumOfDice == SEVEN) 
            { // lose by rolling 7 before point
               gameStatus = Status.LOST;
			   switch(countRolls)  //to count rolls and add to corresponding variable
			   { 
				case 2:
					loss2++;
					break;
				case 3:
					loss3++;
					break;
				case 4:
					loss4++;
					break;
				case 5:
					loss5++;
					break;
				case 6:
					loss6++;
					break;
				case 7:
					loss7++;
					break;
				case 8:
					loss8++;
					break;
				case 9:
					loss9++;
					break;
				case 10:
					loss10++;
					break;
				default:
					lessThan10Rolls++;
			   }
            }
			
         } 

      } 

	  
		
	  }

	int totalWins = win1 + win2 + win3 +win4 + win5 + win6 + win7 + win8 + win9 + win10 + moreThan10Rolls;
	int totalLosses = loss1 + loss2 + loss3 + loss4 + loss5 + loss6 + loss7 + loss8 + loss9 + loss10 + lessThan10Rolls;
	
	// printing the statistics: total wins and losses, wins ad losses and win percentage, chances of winning, 
	// average length of game
	System.out.printf("Total Wins + Losses: %d\n", totalWins+totalLosses);
	System.out.printf("Games with more than 10 rolls: %d\n", moreThan10Rolls);
	System.out.printf("Games with less than 10 rolls: %d\n", lessThan10Rolls);
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 1. Win percent = %.2f%%\n", win1, loss1, (100.0*win1/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 2. Win percent = %.2f%%\n", win2, loss2, (100.0*win2/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 3. Win percent = %.2f%%\n", win3, loss3, (100.0*win3/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 4. Win percent = %.2f%%\n", win4, loss4, (100.0*win4/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 5. Win percent = %.2f%%\n", win5, loss5, (100.0*win5/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 6. Win percent = %.2f%%\n", win6, loss6, (100.0*win6/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 7. Win percent = %.2f%%\n", win7, loss7, (100.0*win7/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 8. Win percent = %.2f%%\n", win8, loss8, (100.0*win8/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 9. Win percent = %.2f%%\n", win9, loss9, (100.0*win9/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Roll 10. Win percent = %.2f%%\n", win10, loss10, (100.0*win10/(totalWins+totalLosses)));
	System.out.printf("Wins = %d Vs. Loss = %d on Rolls more than 10. Win percent = %.2f%%\n", moreThan10Rolls, lessThan10Rolls, (100.0*moreThan10Rolls/(totalWins+totalLosses)));
	System.out.printf("Chances of winning a game of craps is %.2f%%\n", (100.0*totalWins/(totalWins+totalLosses)));
	System.out.printf("Average length of a game: %f", (totalRolls/1000000.0));
   } 

   // roll dice, calculate sum and display results
   public static int rollDice() 
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      return sum; 
   } 

   




} 