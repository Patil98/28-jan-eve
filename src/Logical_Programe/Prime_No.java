package Logical_Programe;

import java.util.Scanner;

public class Prime_No 
{
	
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter a number");
		
		int no=103;        //s.nextInt();
		int temp=0;
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println(no + ": is prime no");
		}
		else
		{
			System.out.println(no + ": is not prime no");
		}
	}

}
