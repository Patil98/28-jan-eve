package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_LinkedList 
{
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();           // no default capacity
		
		l.add("amol");
		l.add(145);
		l.add(65.9f);
		l.add("amol");
		l.add(null);
		l.add(null);
		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.get(2));
		
		// update or modify
		
		l.set(1, 150);
		System.out.println(l);
		
		//add info in between LinkedList
		l.add(2,"bhushan");
		System.out.println(l);
		
		
		//remove info in between LinkedList
          l.remove(4);
		 System.out.println(l);
          
 System.out.println("--print data using iterator  cursor--");
		
	Iterator it = l.iterator();
		
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("----print data using ListIterator cursor----");
	
	ListIterator t = l.listIterator();
	
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
		System.out.println("----print data using for loop----");

		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("----print data using for Each loop----");

		for(Object d:l)
		{
			System.out.println(d);
		}
		
		
	}

}
