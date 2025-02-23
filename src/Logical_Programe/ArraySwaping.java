package Logical_Programe;

import java.util.Arrays;

public class ArraySwaping 
{

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5};
		System.out.println("before swaping "+Arrays.toString(ar));

		int temp=ar[1];
		ar[1]=ar[3];
		ar[3]=temp;

		System.out.println("After swaping "+Arrays.toString(ar));

	}
}
