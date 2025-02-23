package bhushan;

public class PrintPrimeNumber 
{
	private static void nums(int num1,int num2)
	{
		for(int i=num1; i<=num2; i++)
		{
			int temp=0;

			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.print(i+" ");
			}

		}
	}

	public static void main(String[] args) 
	{
		nums(1,50);
	}

}
