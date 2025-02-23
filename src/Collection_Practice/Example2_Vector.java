package Collection_Practice;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector 
{

	public static void main(String[] args) 
	{

		Vector v = new Vector();
		v.add("bhushan");
		v.add(102);
		v.add(102.3);
		v.add('d');
		v.add(85.6f);
		v.add("bhushan");
		v.add(null);
		v.add(null);
		v.add(null);

		System.out.println(v.get(1));
		System.out.println(v.get(8));
		System.out.println(v.isEmpty());
		System.out.println(v.contains('d'));


		System.out.println("----print data using  ListIterator cursor----");

		ListIterator l = v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}

		System.out.println("----print data using for Enumeration cursor----");

		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		System.out.println("----print data using  ListIterator cursor----");

		ListIterator h = v.listIterator();
		while(h.hasNext())
		{
			System.out.println(h.next());
		}

		//h.add("kuldeep");
		System.out.println(v);

		//h.remove();
		System.out.println(v);

		h.set("dheeraj");
		System.out.println(v);




	}

}
