package Logical_Programe;

public class PrintPrimeNumFrom1To100 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=20; i++)
		{   
			int count=0;			
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0 && i>1)
			{
				System.out.print(i+" ");
			}

		}
	}

}
