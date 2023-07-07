package Array;

import java.util.Arrays;

public class example4_intArraySorting
{
	public static void main(String[] args) 
	
	{
		int ar[]=new int[4];
		
	    ar[0]=30;
	    ar[1]=20;
	    ar[2]=40;
	    ar[3]=10;
	    
	    System.out.println("----------print original info--------");
		
	    for(int i=0; i<=ar.length-1; i++)
	    {
	    	System.out.println(ar[i]);
	    }
	   System.out.println(".............."); 
	       Arrays.sort(ar);
	       
	       System.out.println(ar[0]);
	       
	       System.out.println(ar[ar.length-1]);
	   // diff class name.method name(array object name)
	       
	       System.out.println("----------print array info in ascending order------");
	     
	  for(int i=0; i<=ar.length-1;  i++)
	  {
		  System.out.println(ar[i]);
	  }
	  
	  System.out.println("--------------print array info in descending order-----------");
	  
	  for(int i=ar.length-1; i>=0; i--)
	  {
		  System.out.println(ar[i]);
	  }
	  System.out.println(".......................");
	  
	  System.out.println(ar[3]);
	  
	  
	  
	  
	       
	}

}
