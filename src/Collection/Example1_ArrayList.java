package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1_ArrayList 
{

	public static void main(String[] args) 
	{
	//	ArrayList a1=new ArrayList();        //intial /by defaul capacity = 10
		
		ArrayList a1=new ArrayList(8);       //intial /by defaul capacity = 8
		
		a1.add("bhushan");
		a1.add(101);
		a1.add(85.5f);
		a1.add('A');
		a1.add(101);      //500
		a1.add(null);     //101
		a1.add(null);     // null
		                  // null
		
		System.out.println(a1);
		System.out.println(a1.size());    //4
		System.out.println(a1.isEmpty());  // false
		System.out.println(a1.get(0));     // bhushan
		
	System.out.println(a1.set(2, 85.9));
		
		
		//add info in between arraylist --> right shift operation
		
		a1.add(4, 500);
		System.out.println(a1);
		
		//remove info in between arraylist --> left shift operation

         a1.remove(4);
         System.out.println(a1);
         
         
         System.out.println("------print the data using iterator cursor-----");
         
         Iterator itr =a1.iterator();
         
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       
       System.out.println("------print the data using listiterator cursor-----");
       
       ListIterator it = a1.listIterator();
       
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
       System.out.println("------print the data using for loop-----");
       
       for(int i=0; i<a1.size(); i++)
       {
    	   System.out.println(a1.get(i));
       }
       
       System.out.println("------print the data using for each loop-----");
       
       for(Object b1:a1)
       {
    	   System.out.println(b1);
       }
       
       System.out.println(a1.size());
       
     a1.clear();
     
     System.out.println(a1.size());
       
       
		
		
	}
	
}
