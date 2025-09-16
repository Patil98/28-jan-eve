package Logical_Programe;

public class Factorial_Recursion {

	public static int Factorial(int n)
	{
		if(n==1)
		{
			return n;
		}
		else
		{
			return n*Factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println(Factorial(5));
		
	}
	
}
