package Collection;

import java.util.HashSet;
import java.util.Set;

public class ConvertSetIntoArray2
{
	
	public static void main(String[] args) 
	{
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("bhushan");
		hashSet.add("anil");
		hashSet.add("kuldeep");
		hashSet.add("dheeraj");
		
		String[] array = hashSet.toArray(new String[hashSet.size()]);
		
		for(String ar:array)
		{
			System.out.println(ar);
		}
		
		
	}

}
