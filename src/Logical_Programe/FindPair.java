package Logical_Programe;

public class FindPair 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,5,6,8,7,9};
		int sum=9;

		for(int i=0; i<arr.length; i++) 
		{
			for (int j=i+1; j<arr.length; j++) 
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}

		}

	}
}
