package Logical_Programe;

import java.util.HashSet;

public class Remove_duplicate_character_from_string 
{
	
	public static void main(String[] args) 
	{
		String s="abcdefabcdeffgh";
		//char[] ar=s.toCharArray();
		
		HashSet<Character> h=new HashSet();
		
		for(int i=0; i<s.length(); i++)
		{
			h.add(s.charAt(i));
			
		}
	
		for(Character s1:h)
		{
			System.out.print(s1);
		}
		
	}

}
