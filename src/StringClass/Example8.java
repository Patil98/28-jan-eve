package StringClass;

public class Example8
{

	public static void main(String[] args) 
	{
		String s="velocity";
		
		String s1[]=s.split("");
		
		for(int i=0; i<s1.length; i++)
		{
			System.out.println(s1[i]);
		}
		
		System.out.println(".........");
		
		String s2= "this is string";
		
		System.out.println(s2.replace("this", "string"));
		
		
	}
	
}
