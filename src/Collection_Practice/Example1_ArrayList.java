package Collection_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1_ArrayList 
{

	public static void main(String[] args)
	{
		String property = System.getProperty("user.dir");
		System.out.println(property);
		
		ArrayList a = new ArrayList();
		a.add("bhushan");
		a.add("kuldeep");
		a.add(102);
		a.add(85.6);
		a.add("bhushan");
		a.add(null);
		a.add(null);
		a.add(null);
		
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.get(1));
		System.out.println(a.contains("di"));
	
		System.out.println(".......");
		//update the data
		Object set = a.set(5, 65.3);
		System.out.println(set);
		System.out.println(a);
		
		System.out.println(".......");
		//add the data
		a.add(6, "anil");
		System.out.println(a);
		
		System.out.println(".......");
		//remove the data
		a.remove(7);
		System.out.println(a);
		
		System.out.println("------print the data using iterator cursor-----");

		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("------print the data using listiterator cursor-----");
		
		ListIterator l = a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
			
		}
		System.out.println("-------");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		
		System.out.println("------print the data using for loop-----");
		
		for(int j=0; j<a.size(); j++)
		{
			System.out.println(a.get(j));
		}
		
		System.out.println("------print the data using for each loop-----");

		for(Object p:a)
		{
			System.out.println(p);
		}
		
	}
	
	

}
