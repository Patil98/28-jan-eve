package Array;

import java.util.Arrays;

public class example10 // find Lowest and Highest num in Array

{

public static void main(String[] args)
{
	int ar[]=new int[4];
	
	ar[0]=30;
	ar[1]=20;
	ar[2]=40;
	ar[3]=10;
	
	Arrays.sort(ar);
	
	System.out.println("---lowest num in Array----");
	
	System.out.println(ar[0]);
	
	System.out.println("------highest num in Array--------");
	
	System.out.println(ar[ar.length-1]);
}
}
