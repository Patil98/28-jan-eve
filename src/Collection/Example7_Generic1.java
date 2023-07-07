package Collection;

import java.util.TreeSet;

public class Example7_Generic1 
{
	public static void main(String[] args) {
		
	
  TreeSet<Integer>s=new TreeSet<Integer>();
	
	s.add(100);
	s.add(101);
	s.add(105);
	s.add(107);
	s.add(110);
	s.add(104);
	s.add(106);
	s.add(102);
	s.add(103);
	
	for(Integer i:s)
	{
		System.out.println(i);
	}

}
}
	
	
	
	
	