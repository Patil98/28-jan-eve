package Logical_Programe;

import java.util.Scanner;

public class Leap_Year 

{
	public static void main(String[] args) 
	
	{
		int year=2024;
		//System.out.println("enter year");
		//Scanner s=new Scanner(System.in);
		//year=s.nextInt();
		
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println("this is leap year");
		}
		else 
		{
		System.out.println("this is not leap year");	
		}
			
	}
	

}
