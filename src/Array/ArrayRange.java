package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRange
{
	public static void main(String[] args) 
	{
		//1 to 4 -->> [1,2,3,4]
		//1 to 10 -->> [1,2,3,4,5,6,7,8,9,10]
		
		System.out.println(Arrays.toString(Between(1, 5)));
		
	}
	public static int[] Between(int a,int b) 
	{
		return IntStream.rangeClosed(a, b).toArray();
		
	}

}
