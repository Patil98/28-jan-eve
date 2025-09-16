package Logical_Programe;

import java.util.Arrays;

public class Swap_First_And_Last_from_Array {

	public static void main(String[] args) {

		int[] ar={10,30,60,50,20,40};

		for(int i=0; i<ar.length; i++)
		{
			int n=i;

			while(i<ar.length)
			{
				i++;
			}

			int temp=ar[n];
			ar[n]=ar[i-1];
			ar[i-1]=temp;

		}
		System.out.print(Arrays.toString(ar));

	}

}
