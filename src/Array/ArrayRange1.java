package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRange1 
{
	 public static void main(String[] args) 
	    {
	       
	      int[] ar=IntStream.rangeClosed(1,10).toArray();
		  System.out.println(Arrays.toString(ar)) ;
		
	    }

}
