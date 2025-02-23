package Logical_Programe;

import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		//pre-condition is Arrays Should be Sorted
		int a[]= {1,2,3,4,5,6,7,8,9,10}; 
		
		int key=11;		
		int l=0;
		int h=a.length-1;
		
		boolean flag=false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(key==a[m])
			{
				System.out.println("Elements is Found...");
				flag=true;
				break;
			}
			
			else if(key>a[m])
			{			
				l=m+1;	
			}
		
			else if(key<a[m])
			{			
				h=m-1;	
			}
		
		}
		
		if(flag==false)
		{
			System.out.println("Elements is Not Found...");
		}
	
		
		//approach-2
//		System.out.println(Arrays.binarySearch(a, 5));
	}

}
