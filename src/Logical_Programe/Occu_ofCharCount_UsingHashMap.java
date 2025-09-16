package Logical_Programe;

import java.util.HashMap;
import java.util.Map;

public class Occu_ofCharCount_UsingHashMap {

	public static void main(String[] args) {
		
		String ch="aabbbccccc";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char cha:ch.toCharArray())
		{
			hm.put(cha, hm.getOrDefault(cha, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> ent:hm.entrySet())
		{
			System.out.println(ent.getKey()+" = "+ent.getValue());
		}
		
		

	}

}
