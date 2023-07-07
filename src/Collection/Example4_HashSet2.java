package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Example4_HashSet2
{
	
	public static void main(String[] args) 
	{
		
		ArrayList a=new ArrayList();
		
		a.add("bhushan");
		a.add(101);
		a.add(85.5f);
		a.add('A');
		a.add(101);      
		a.add(null);    
		a.add(null);  
		
		System.out.println(a);
		
		
		HashSet ha=new HashSet(a);
		
		System.out.println(ha);
		
	}

}
