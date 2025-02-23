package Logical_Programe;

public class FindMaximumOf_3_Number 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=200;
		int c=150;
		
		/*int max = Math.max(Math.max(a, b), c);
		System.out.println(max);*/
		
		int large=a>b?a:b;
		int largest=large>c?large:c;
		
		System.out.println(largest);
		
	}

}
