package Logical_Programe;

public class Find_Minimum_values_in_int_Array
{
	public static void main(String[] args)
	{
		int ar[]= {5,6,10,2,15,19,20};

		int min=ar[0];

		for(int i=0; i<ar.length; i++)
		{             
			if(ar[i]<min)
			{
				min=ar[i]; 
			}	
		}
		System.out.println("min elements in this array : "+ min);




	}
}
