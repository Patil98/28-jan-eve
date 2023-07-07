package Array;

public class example11_MultiOfTwoMatrices 

{
	public static void main(String[] args) 
	{
		int a[][]= {{2,3,4},{1,6,8}};
		int b[][]= {{4,6,8},{7,8,9}};
		int c[][]=new int[2][3];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++) 
			{
				
			c[i][j]=a[i][j]*b[i][j];
			
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
	

}
