package Array;

import java.util.Arrays;

public class example9 

// multi dimensional Array declaration and initialization in one line
{
	public static void main(String[] args) 
	
//  0   1    2
//0 10   20   30 
//1 40   50   60

	{
		int ar [][]={{10,20,30},{40,50,60}};
		
		System.out.println(ar[1][2]);
				
	
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(ar[i][j]+"  ");
			}
				System.out.println();
		}
		
		
	}	

}
