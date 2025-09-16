package Logical_Programe;

public class DuplicateElementFromArray_SingleTime 
{
	public static void main(String[] args) 
	{
		int [] ar={12,14,12,4,93,5,78,4,93};

		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
}
