package bhushan;

public class ArrayDuplicatesRemove
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,5,4,1,2,8,6,5};
		
		
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
				System.out.println(ar[i]+" ");
				break;
			}
		}
		

	}

}
