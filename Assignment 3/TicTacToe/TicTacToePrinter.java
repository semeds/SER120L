public class TicTacToePrinter 
{
	//1 represent X and -1 represents O
	public static void printBoard(int array[][])
	{
		//check if array is of the dimension 3X3
		if(array.length==3 && array[0].length==3 && array[1].length==3
				&& array[2].length==3)
			;
		else
		{
			System.out.println("Your array must be of 3X3 dimension");
			return;
		}
		String values[][] = new String[3][3];
		//check if array contains anything else than 1, 0, -1
		//1 means X, 0 means available, -1 means O
		for(int index1=0;index1<array.length;index1++)
		{
			for(int index2=0;index2<array[index1].length;index2++)
			{
				if(array[index1][index2]>1 || array[index1][index2]<-1)
				{
					System.out.println("Your array contains invalid values");
					System.out.println("Correct values are: 1=X, 0=available, -1=O");
					return;
				}
				if(array[index1][index2]==1)
				{
					values[index1][index2]= "X";
				}
				else if (array[index1][index2]==-1)
				{
					values[index1][index2]= "O";
				}
				else
				{
					values[index1][index2]= "-";
				}
			}
		}
		
		System.out.println();
		System.out.println("- is available");
		System.out.println();
		System.out.printf("%-8s %2s   %2s   %2s%n", "column \u2192", "0","1","2");
		System.out.println("row \u2193");
		System.out.printf("%-8s %2s | %2s | %2s%n", "0", values[0][0],values[0][1],values[0][2]);
		System.out.printf("%-8s %2s | %2s | %2s%n", "1", values[1][0],values[1][1],values[1][2]);
		System.out.printf("%-8s %2s | %2s | %2s%n", "2", values[2][0],values[2][1],values[2][2]);
	}
}