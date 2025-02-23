package Collection;

import java.util.HashSet;
import java.util.Set;

public class ConvertSetIntoArray1 
{
	public static void main(String[] args) 
	{
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1124);
		hashSet.add(3654);
		hashSet.add(7854);
		hashSet.add(9945);

		Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);

		for(Integer ar:array)
		{
			System.out.println(ar);
		}

	}
}
