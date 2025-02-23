package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector 
{

	public static void main(String[] args) 
	{

		//	Vector v= new Vector();         // intial capacity is =10
		Vector v= new Vector(8); 

		v.add("bhushan");
		v.add(102);
		v.add(85.6f);
		v.add("bhushan");
		v.add(null);
		v.add(null);


		System.out.println(v);	
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.capacity());

		//add info in between vector --> right shift operation 

		v.add(2, "anil");
		System.out.println(v);
		System.out.println(v.size());

		//remove info in between vector --> left shift operation

		v.remove(4);
		System.out.println(v);
		System.out.println(v.size());

		System.out.println("----print data using Iterator cursor----");

		Iterator it = v.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("----print data using  ListIterator cursor----");


		ListIterator ite = v.listIterator();

		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}


		System.out.println("----print data using for loop----");

		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}

		System.out.println("----print data using for each loop----");

		for(Object b:v)
		{
			System.out.println(b);
		}

		System.out.println("----print data using for Enumeration cursor----");

		Enumeration enu = v.elements();	

		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		

	}

}
