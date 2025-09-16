package Logical_Programe;

public class Largest_SmallestFromArray {

	public static void main(String[] args)
	{
		int ar[]= {10,50,20,40,30,80,90};
		int n=ar.length;
		int max=4;
		int min=5;

		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}

			}
			
		}
		System.out.println("4th largest--> "+ar[n-max]);
		System.out.println("5th smallest--> "+ar[min-1]);

	}

}
