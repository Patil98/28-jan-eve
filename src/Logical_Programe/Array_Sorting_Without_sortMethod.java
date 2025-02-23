package Logical_Programe;

public class Array_Sorting_Without_sortMethod
{
	public static void main(String[] args)
	{
		int ar[]= {10,50,20,40,30};
		
		System.out.println("ascending");
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
				{
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
			System.out.println(ar[i]);
		}
		
		
		System.out.println(".....................");
		
		int ar1[]= {10,50,20,40,30};
		
		System.out.println("descending");
		
		for(int i=0; i<ar1.length; i++)
		{
			for(int j=i+1; j<ar1.length; j++)
			{
				if(ar1[i]<ar1[j])
				{
					int te=ar1[i];
					ar1[i]=ar1[j];
					ar1[j]=te;
				}
			}
			System.out.println(ar1[i]);
		}
	
		
		
		
	}
}
