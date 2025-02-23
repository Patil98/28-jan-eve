package bhushan;

public class FindPair 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,5,6,12,7};
		int sum = 6;

		for(int i=0; i<arr.length; i++) 
		{
			for (int j=i+1; j<arr.length; j++) 
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("Pair found at positions:("+arr[i]+","+arr[j]+")");
				}
			}

		}

	}
}
