package Logical_Programe;

import java.util.Scanner;

public class Armstrong_Number 
{
	
	public static void main(String[] args) 
	{
		//153,370,371,1634,
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter any no");*/
		int no= 153;         //s.nextInt();
		int org=no;
		int arm=0;                    
	    int temp;
		
		while(no!=0)
		{
			temp=no%10;
			arm=(arm)+(temp*temp*temp);
		     //temp=Math.pow(temp, 4);
		     // arm=arm+temp;
			no=no/10;		
		}
		if(org==arm)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println("not armstrong no");
		}
	}

	}


