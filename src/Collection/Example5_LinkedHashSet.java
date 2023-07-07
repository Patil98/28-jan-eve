package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example5_LinkedHashSet
{
	
	public static void main(String[] args) 
	{
		LinkedHashSet l=new LinkedHashSet();
		
		l.add("bhushan");
		l.add(125);
		l.add(68.5f);
		l.add('B');
		l.add(125);
		l.add(null);
		l.add(null);
		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains('B'));
		
		l.remove(null);
		System.out.println(l);
		
		System.out.println("-----print data using iterator cursor------");
		 
		   Iterator li =l.iterator();
		
		   while(li.hasNext())
		   {
			   System.out.println(li.next());
		   }
		   
		   System.out.println("-----print data using for each  loop------");
		   
		   for(Object o:l)
		   {
			   System.out.println(o);
		   }
		   
		   System.out.println("......");
		   
		   l.clear();
		   System.out.println(l.size());
		
	}

}
