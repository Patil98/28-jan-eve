package Logical_Programe;

import java.util.HashSet;
import java.util.TreeSet;

public class DuplicatesElementsUsingCollections 
{
	public static void main(String[] args) 
	{
		int ar[]= {5,8,9,5,6,7,9,8,4};

		HashSet hs = new HashSet();
		
		for(int i=0; i<ar.length; i++)
		{
			if(!hs.add(ar[i]))
			{
				System.out.println("Duplicates Elements is "+ar[i]);
			}
		}
	}

}
