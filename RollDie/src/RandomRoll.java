import java.security.SecureRandom;

public class RandomRoll {
	public static void main(String[] args) {
		
		SecureRandom randomNumber = new SecureRandom();
		
		int outcome = 1 + randomNumber.nextInt(6); //random number between 0 and 5, + 1 to scale it
		System.out.println(outcome);
		
		int freq1 = 0, freq2 = 0, freq3= 0, freq4 = 0, freq5 = 0, freq6=0;
		
		for(int count = 0; count < 20000000; count++) {
			
			outcome = 1 + randomNumber.nextInt(6);
			
			switch(outcome) {
				case 1: 
					freq1++;
					break;
				case 2: 
					freq2++;
					break;
				case 3: 
					freq3++;
					break;
				case 4: 
					freq4++;
					break;
				case 5: 
					freq5++;
					break;
				case 6: 
					freq6++;
					break;
			}
		}
		
		System.out.println("1 came " + (freq1/20000000.0)*100 + "% times");
		System.out.println("2 came " + (freq2/20000000.0)*100 + "% times");
		System.out.println("3 came " + (freq3/20000000.0)*100 + "% times");
		System.out.println("4 came " + (freq4/20000000.0)*100 + "% times");
		System.out.println("5 came " + (freq5/20000000.0)*100 + "% times");
		System.out.println("6 came " + (freq6/20000000.0)*100 + "% times");
	}

}
