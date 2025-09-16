package Logical_Programe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortHashMapByValues {

	public static void main(String[] args) {
		Map<String, Integer> unsorted = new HashMap();
		Map<String, Integer> sorted = new LinkedHashMap<>();
		ArrayList<Integer> adding = new ArrayList<>();
		
		unsorted.put("b", 2);
		unsorted.put("e", 4);
		unsorted.put("r", 3);
		unsorted.put("t", 1);
		unsorted.put("y", 5);
		
		for(Map.Entry<String, Integer> get:unsorted.entrySet())
		{
			adding.add(get.getValue());
		}
		
		Collections.sort(adding);
		
		
		for(Integer add:adding)
		{
			for(Map.Entry<String, Integer> data:unsorted.entrySet())
			{
				if(data.getValue().equals(add))
				{
					sorted.put(data.getKey(), add);
				}
			}
		}
		
		
		System.out.println(sorted);
		
		
	}

}
