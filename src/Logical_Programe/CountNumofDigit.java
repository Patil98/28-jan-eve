package Logical_Programe;

public class CountNumofDigit 
{
	public static void main(String[] args) 
	{
		int a=123456;
		int count=0;
		
		while(a!=0) 
		{
			a=a/10;
			count++;	
		}

		System.out.println(count);
	}

}
