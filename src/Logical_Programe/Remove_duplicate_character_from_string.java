package Logical_Programe;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_character_from_string 
{

	public static void main(String[] args) 
	{
		String s="bhushanpatil";
		char[] ar=s.toCharArray();

		Set<Character> h=new LinkedHashSet();

		for(int i=0; i<ar.length; i++)
		{
			if(h.add(ar[i])) 
			{
				System.out.print(ar[i]);
			}

		}

		//System.out.println(s);
		//		
		//		for(Character s1:h)
		//		{
		//			System.out.print(s1);
		//		}

	}

}
