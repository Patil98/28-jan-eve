package Logical_Programe;

import java.util.Scanner;

public class Revers_The_Word 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("String is : ");
		String st="java coding is easy";     // sc.nextLine();		
		String rev=" ";

		String ar[]=st.split(" ");

		for(int i=ar.length-1; i>=0; i--)
		{
			rev=rev+ar[i]+" ";
		}
		System.out.println("reversed:"+rev);



	}

}
