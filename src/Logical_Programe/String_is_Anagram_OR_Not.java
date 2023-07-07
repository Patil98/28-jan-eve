package Logical_Programe;

import java.util.Arrays;

public class String_is_Anagram_OR_Not 
{
	public static void main(String[] args) 
	{
		
		String a="hE Is BHUshan";
		String b="iS He bhuSHAn";
		
		a=a.replace("//s","");
		b=b.replace("//s","");
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		char []x=a.toCharArray();
		char []y=b.toCharArray();
		
		Arrays.sort(x);	
		Arrays.sort(y);	
		
		boolean result = Arrays.equals(x,y);
		
		if(result==true)
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
		
		
		
		
		
	}
	
	

}
