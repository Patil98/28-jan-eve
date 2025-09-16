package Logical_Programe;

public class Find_MaximumMinimum_values_in_int_Array_Without_SortMethod
{
	public static void main(String[] args) 
	{
		int ar[]= {50,6,10,40,15,19,20};

		int max=ar[0];
		int min =ar[0];

		for(int i=0; i<ar.length; i++)
		{            
			if(ar[i]>max)
			{
				max=ar[i];   //40
			}
			else if(ar[i]<min)
			{
				min=ar[i];
			}
		}

		System.out.println("max elements in this array : " + max);
		System.out.println("min elements in this array :" + min);


	}
}