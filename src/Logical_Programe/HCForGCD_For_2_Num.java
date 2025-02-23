package Logical_Programe;
import java.util.Scanner;

public class HCForGCD_For_2_Num
{
	public static void main(String[] args)
	{
		int a,b;            //gabriel lame
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	
		while(a!=0 && b!=0) 
		{
			if(a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
		}
		
		if(a!=0)
		{
			System.out.println("HCForGCD is "+ a);
		}
		else
		{
			System.out.println("HCForGCD is "+ b);
		}
		
	}

}
