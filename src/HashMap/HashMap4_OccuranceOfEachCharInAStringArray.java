package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap4_OccuranceOfEachCharInAStringArray
{
	public static void main(String[] args)
	{
		String sr[] ={"a","b","a","c","c","v","a","b","v","a"};

		HashMap<String,Integer> hs = new HashMap();

		for(String ch:sr)
		{ 
			if(hs.containsKey(ch))
			{
				hs.put(ch, hs.get(ch)+1);
			}
			else
			{
				hs.put(ch, 1);
			}
		}

		Set<String> all =hs.keySet();

		for(String key:all)
		{
			System.out.println(key+"-"+hs.get(key));
		}



	}
}
