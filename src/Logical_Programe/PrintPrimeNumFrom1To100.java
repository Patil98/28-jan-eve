package Logical_Programe;

public class PrintPrimeNumFrom1To100 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=20; i++)
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

}
