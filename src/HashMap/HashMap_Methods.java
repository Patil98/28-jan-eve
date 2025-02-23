package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Methods 
{
	public static void main(String[] args) 
	{
		//Map map=new HashMap();
		//HashMap m=new HashMap();
		HashMap<Integer, String> m=new HashMap<>();

		// to add entry in hashmap
		m.put(1, "bhushan");
		m.put(2, "Dheeraj");
		m.put(3, "amol");
		m.put(4, "kuldeep");
		m.put(null, "abc");
		m.put(5, "bhushan");

		System.out.println(m);  

		System.out.println(m.get(3));  //return keys value

		m.remove(5);
		System.out.println(m);  // remove keys value 


		System.out.println(m.containsKey(2));  //true
		System.out.println(m.containsKey(5));   //false

		System.out.println(m.containsValue("bhushan"));  //true
		System.out.println(m.containsValue("xyz")); //false

		System.out.println(m.isEmpty()); //true

		System.out.println(m.size());  // return size

		//  m.clear();
		// System.out.println(m);   // clear the hashmap


		//System.out.println(m.keySet());  // return the all keys
		for(Integer h:m.keySet())
		{
			System.out.println(h+"-"+m.get(h));
		}

		/*//System.out.println(m.values()); // return the all values
		for(String s:m.values())
		{
			System.out.println(s);
		}*/

		//System.out.println(m.entrySet()); // return the all entries
		for(Entry<Integer, String> p:m.entrySet())
		{
			System.out.println(p.getKey()+"->"+p.getValue());
		}

		System.out.println("-------------");
		// iterate through key/value mappings
		Iterator<Entry<Integer, String>> it = m.entrySet().iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("-------------");
		// iterate through keys
		Iterator<Integer> ite = m.keySet().iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}

		System.out.println("-------------");
		// iterate through values
		Iterator<String> t = m.values().iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}

		System.out.println("-------------");
		//iteration over map using forEach() method  
		m.forEach((k,v)->System.out.println("key: "+k+", values: "+v));
	}

}
