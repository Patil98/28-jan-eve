package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example6_TreeSet 
{
  public static void main(String[] args) 
{
	
	TreeSet s=new TreeSet();
	
	s.add(100);
	s.add(101);
	s.add(105);
	s.add(107);
	s.add(110);
	s.add(104);
	s.add(106);
	s.add(102);
	s.add(103);
	
	
       System.out.println(s);
       System.out.println(s.size());
       System.out.println(s.isEmpty());
       System.out.println(s.contains(110));
	
       
       s.remove(110);
       System.out.println(s);
       
       System.out.println(s.first());       // display first
	  System.out.println(s.last());           // display last
	
	  
	  System.out.println(s.pollFirst());       //remove element from 1st position
	  System.out.println(s);
	  
	  System.out.println(s.pollLast());          //remove element from last  position
	  System.out.println(s);
	  
	  
	  System.out.println("-------print all data using iterator---");
	  
	 Iterator i = s.iterator();
	 
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	 
	 System.out.println("-------print all data using for each loop-- -----");

	 for(Object o:s)
	 {
		 System.out.println(o);
		 
	 }
	 
	 
	  
}
}
