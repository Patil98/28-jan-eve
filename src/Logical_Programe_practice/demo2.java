package Logical_Programe_practice;

public class demo2 {

	public static void main(String[] args) 
	{
		int a=12345;
		int sum=0;
		
		while(a!=0)
		{
			sum+=a%10;
			a=a/10;
		}
		System.out.println(sum);

	}

}
