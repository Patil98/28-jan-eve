package Logical_Programe;

public class int_array_missingNum 
{
	
	public static void main(String[] args)
	{
		int ar[]= {1,2,3,4,5,7,8,6,10};
		
		int sum=10*11/2; //n*(n+1)/2    n=last num
		
		int actualsum=0;
		
		for(int i=0; i<ar.length; i++)
		{
			actualsum=actualsum+ar[i];  	
		}

		System.out.println("missing num is : " +(sum-actualsum));
		
	}

}
