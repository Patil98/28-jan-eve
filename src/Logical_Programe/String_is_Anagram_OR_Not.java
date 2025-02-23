package Logical_Programe;

import java.util.Arrays;

public class String_is_Anagram_OR_Not 
{
	public static void main(String[] args) 
	{
		String a="he is BHUshan";
		String b="iS He bhuSHAn";
		
		//a=a.replace(" ","");
		//b=b.replace(" ","");
	
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		char []x=a.toCharArray();
		char []y=b.toCharArray();
		
		Arrays.sort(x);	
		Arrays.sort(y);	
		
		boolean result = Arrays.equals(x,y);
		
		if(result)
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
		
	}

}
