package Logical_Programe;

import java.util.HashMap;
import java.util.Map;

public class Occu_ofstringCount_UsingHashMap {
	public static void main(String[] args) {
		String ch="bhushan patil patil";

		HashMap<String, Integer> hm = new HashMap<>();

		for(String cha:ch.split(" "))
		{
			hm.put(cha, hm.getOrDefault(cha, 0)+1);
		}

		for(Map.Entry<String, Integer> ent:hm.entrySet())
		{
			System.out.println(ent.getKey()+" = "+ent.getValue());
		}

	}


}
