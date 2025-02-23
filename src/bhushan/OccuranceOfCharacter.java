package bhushan;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfCharacter 
{

	public static void main(String[] args)
	{
	   String name="bhushan";

	  HashMap<Character, Integer> ha = new HashMap<>();
	  
	  for(int i=0; i<name.length(); i++)
	  {
		  char ch = name.charAt(i);
		 if(ha.containsKey(ch))
		 {
			 ha.put(ch, ha.get(ch)+1);
		 }
		 else
		 {
			 ha.put(ch, 1);
		 }
	  }
	  	  
	  Set<Character> keys = ha.keySet();
	  for(Character key:keys)
	  {
		  System.out.println(key+"-"+ha.get(key));
	  }

	}

}
