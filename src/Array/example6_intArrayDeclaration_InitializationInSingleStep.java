package Array;

import java.util.Arrays;

public class example6_intArrayDeclaration_InitializationInSingleStep 

{

	public static void main(String[] args)
	{
		int ar[]= {30,20,40,10};
		
		System.out.println(ar.length);       // 4
		
		System.out.println(ar[1]);      //20
		
		
//		System.out.println("---------print all data ------");
//		
//		for(int i=0; i<=ar.length-1; i++)
//		{
//			System.out.println(ar[i]);
//		}

		System.out.println(".....................");
		
	Arrays.sort(ar);
	
	System.out.println(ar[0]);
	
	System.out.println(ar[ar.length-1]);
	
		
		}
		
	
}
