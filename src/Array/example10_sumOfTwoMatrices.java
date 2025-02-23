package Array;

public class example10_sumOfTwoMatrices 

       // ADDITION OF TWO MATRICES

{
	public static void main(String[] args)
	{
		int a[][]={{1,3,4},{3,4,5}};
		int b[][]={{1,3,4},{3,4,5}};
		
		int c[][]=new int[2][3];
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++) 
			{
			 c[i][j]=a[i][j]+b[i][j];
			
			System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

	
}
