package Logical_Programe;

public class addition
{
	public static void main(String[] args) 
	{
	    int a=1234;
		int sum=0;
		
		while(a!=0)
		{
			sum+=a%10;
			a=a/10;
		}
		
		System.out.println(sum);
		
	}
}
