package Collection;

import java.util.ArrayList;

import javax.swing.Spring;

public class Example7_Generic2
{
	
	public static void main(String[] args)
	{
		
		ArrayList<String> a=new ArrayList<String>();
	
		a.add("bhushan");
		a.add("anil");
		a.add("amol");
		a.add("atul");
		//a.add(102);
		
		
		for(String s:a)
		{
			System.out.println(s);
		}
		
	}

}
