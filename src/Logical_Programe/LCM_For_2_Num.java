package Logical_Programe;

import java.util.Scanner;

public class LCM_For_2_Num 
{
	public static void main(String[] args)
	{
		int a,b,l,i;

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		l=a>b?a:b;      //The expression l=a>b?a:b; is a ternary operator in Java.

		for(i=l; i<=a*b; i+=l)  
		{
			if(i%a==0 && i%b==0)    
			{
				break;
			}
		}
		System.out.println("lcm is "+i);

		sc.close();

	}

}
