package Logical_Programe;

public class revers_the_number 

{
	public static void main(String[] args) 
	{
		int no=123456789;
		int rem;
		int rev =0;
	
		
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
		     no=no/10;
		}
		
		System.out.println("revers num is :"+ rev);
	}
}
