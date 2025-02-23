package bhushan;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesElementsInString
{
	public static void main(String[] args) 
	{
		String s="bhushanpatil";
		char[] ar=s.toCharArray();
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+" ");
				}

			}  
		}
	}

}
