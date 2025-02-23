package Logical_Programe;

public class Fibonacci_Series 
{
	public static void main(String[] args) 
	{
	//0,1,1,2,3,5,8,13,21,34,55,89,146
	
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+" "+b);
		
		for(int i=0; i<15; i++)
		{
			c=a+b;  
			System.out.print(" "+c);
			a=b;  //1
			b=c;  //1
		}
		
	}
	
}
