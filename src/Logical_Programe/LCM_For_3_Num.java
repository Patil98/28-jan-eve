package Logical_Programe;

import java.util.Scanner;

public class LCM_For_3_Num 
{
	public static void main(String[] args)
	{
		int a,b,c,l,i;

		Scanner sc=new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		l=a>b?a:b;      //The expression l=a>b?a:b; is a ternary operator in Java.
		l=b>c?a:b; 

		for(i=l; i<=a*b*c; i+=l)  
		{
			if(i%a==0 && i%b==0 && i%c==0)    
			{
				break;
			}
		}

		System.out.println("lcm is "+i);



	}
}
