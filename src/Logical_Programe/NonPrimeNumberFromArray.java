package Logical_Programe;

public class NonPrimeNumberFromArray 
{

	public static void main(String[] args)
	{
		int ar []={2,3,4,5,6,7,8};

		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			for(int j=2; j<ar[i]; j++)
			{
				if(ar[i]%j==0)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(ar[i]);
			}
		}
	}

}
