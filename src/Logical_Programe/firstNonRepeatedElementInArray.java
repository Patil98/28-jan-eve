package Logical_Programe;

public class firstNonRepeatedElementInArray 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,5,2,6,1,4,2};

		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			for(int j=0; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ar[i]);
				break;
			}
		}
	}
}
