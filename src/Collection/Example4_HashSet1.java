package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example4_HashSet1
{

	public static void main(String[] args) 
	{
		
		HashSet h=new HashSet();
		
		h.add("bhushan");
		h.add(120);
		h.add(85.5f);
		h.add('A');
		h.add("bhushan");
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(120));
		
		System.out.println(h.remove(120));
		System.out.println(h);
		
		
		System.out.println("-----print data using iterator cursor------");
		
		Iterator set = h.iterator();
		
		while(set.hasNext())
		{
			System.out.println(set.next());
		}
		
		System.out.println("-----print data using for each loop------");

		for(Object s:h)
		{
			System.out.println(s);
		}
		
		h.clear();
		System.out.println(h.size());
		
		
		
		
	}
	
}
