package bhushan;

public class demo1 
{
	public static void main(String[]args)
	{
		
		for(int i=1; i<=5; i++)
		{
			int k=i;
			for(int j=1; j<i; j++)
			{
				System.out.print((k+1)%j);
			}
			System.out.println();
			
		}
		
	}
	
}
