package bhushan;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfEachCharInAString 
{

	public static void main(String[] args) 
	{
		String s="bhushanpatil";

		HashMap<Character,Integer> m = new HashMap();

		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);

			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}


		Set<Character> keySet = m.keySet();

		for(Character allkeys:keySet)
		{
			System.out.println(allkeys+"-"+m.get(allkeys));
		}





	}

}
