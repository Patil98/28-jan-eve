package Logical_Programe;

public class Duplicate_words_in_StringArray 
{
	public static void main(String[] args) 
	{
		String ar[]={"bhushan","atul","bhushan","anil","atul"};

		System.out.println("duplicate word in above string are : " ); 

		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
				}

			}  
		}



	}
}
