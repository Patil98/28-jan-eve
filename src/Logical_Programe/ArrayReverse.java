package Logical_Programe;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5};

		for(int i=0; i<ar.length/2; i++)
		{
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];	
			ar[ar.length-1-i]=temp;

		}

		System.out.println(Arrays.toString(ar));
	}

}

