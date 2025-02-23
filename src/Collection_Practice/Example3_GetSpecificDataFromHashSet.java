package Collection_Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Example3_GetSpecificDataFromHashSet
{

	public static void main(String[] args) 
	{

		HashSet h = new HashSet();
		h.add("bhushan");
		h.add("divanshu");
		h.add(102);
		h.add(85.4);
		h.add('d');

		System.out.println(h);

		//get specific data from hashset
		Object[] array = h.toArray(new Object[h.size()]);
		System.out.println(array[2]);
		System.out.println(array[3]);

		System.out.println("-------");

		//get specific data from hashset
		ArrayList a = new ArrayList(h);
		System.out.println(a.get(0));
		System.out.println(a.get(3));


	}

}
