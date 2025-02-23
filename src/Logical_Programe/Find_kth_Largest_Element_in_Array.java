package Logical_Programe;

public class Find_kth_Largest_Element_in_Array 
{
	
	public static void main(String[] args)
	{
		int ar[]= {10,50,20,40,30,80,90,70};
		int k=4;
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			
			}
			if(i==k-1)
			{
				System.out.println(k+"th largest element is : "+ar[i]);
			
			}
		
		}
		
	}

}
