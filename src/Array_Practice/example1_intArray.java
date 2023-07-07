package Array_Practice;

import java.util.Arrays;

public class example1_intArray 
{
	
	public static void main(String[] args) 
	{
		
		int ar[]= new int [5];
		
		ar[0]=50;
		ar[1]=20;
		ar[2]=40;
		ar[3]=30;
		ar[4]=10;
		
		
		System.out.println(ar.length);
		System.out.println(ar[1]);
		System.out.println(ar[ar.length-1]);
		
		
		System.out.println("----print all data----");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
        Arrays.sort(ar);
        
		System.out.println("----print data in ascending----");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----print all data in descending----");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-----------------");
		System.out.println(ar[0]);
		System.out.println(ar[ar.length-1]);
		
	}

}
