package Array_Practice;

public class example5_sumOfTwoMatrices 
{
	public static void main(String[] args)
	{

		int a[][]= {{10,30,20,40},{60,50,70,80}};
		int b[][]= {{40,15,25,29},{25,54,58,53}};
		int c[][]= new int [2][4];

		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];

				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}



	}
}
