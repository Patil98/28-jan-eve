package bhushan;

public class MaximumOf_3_Number 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=200;
		int c=150;
		
		int max = Math.max(Math.max(a, b), c);
		System.out.println(max);
	
		int addExact = Math.floorDiv(b, a);
		System.out.println(addExact);
		
	}

}
