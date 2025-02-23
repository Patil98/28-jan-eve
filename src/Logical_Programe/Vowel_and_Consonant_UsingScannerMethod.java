package Logical_Programe;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Vowel_and_Consonant_UsingScannerMethod
{
	public static void main(String[] args) 
	{ 

		System.out.println("enter any character");
		Scanner r=new Scanner(System.in);
		char s=r.next().charAt(0);

		if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
		{
			System.out.println("char is vowel");
		}
		else
		{
			System.out.println("char is consonant");
		}

	}

}

