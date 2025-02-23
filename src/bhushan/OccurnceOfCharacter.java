package bhushan;

import java.util.HashMap;
import java.util.Set;

public class OccurnceOfCharacter 
{
	public static void main(String[] args) 
	{
		String s="bhushanpatil";
		
		HashMap<Character, Integer>h = new HashMap();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(h.containsKey(ch))
			{
				h.put(ch, h.get(ch)+1);
			}
			else
			{
				h.put(ch, 1);
			}
		}
		
		Set<Character> all = h.keySet();
		
		for(Character key:all)
		{
			System.out.println(key+"-"+h.get(key));
		}
		
	}

}
