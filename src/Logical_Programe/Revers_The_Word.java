package Logical_Programe;

public class Revers_The_Word 
{
	
	public static void main(String[] args) 
	{
		String st="java coding is easy";
		String rev=" ";
		
		String ar[]=st.split(" ");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			rev=rev+ar[i]+" ";
		}
		System.out.println("reversed :" + rev);
		
		
		
	}

}
