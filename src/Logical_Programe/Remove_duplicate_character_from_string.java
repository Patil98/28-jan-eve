package Logical_Programe;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_character_from_string 
{

	public static void main(String[] args) 
	{
		//using the for loop
//		String s="bhushan patil";
//		char[] ar=s.toCharArray();
//
//		Set<Character> h=new LinkedHashSet<>();
//
//		for(int i=0; i<ar.length; i++)
//		{
//			if(h.add(ar[i])) 
//			{
//				System.out.print(ar[i]);
//			}
//
//		}

		
		//using the forEach loop
		String s1 = "bhushan patil";
		char[] ar1 = s1.toCharArray();

		Set<Character> h1 = new LinkedHashSet<>();

		for(char c : ar1)
		{                   // using for-each loop
			if(h1.add(c)) 
			{ // adds only if the character is not already present
				System.out.print(c);
			}
		}
	}

}
