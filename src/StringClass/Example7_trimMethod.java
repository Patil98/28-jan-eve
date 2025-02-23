package StringClass;

public class Example7_trimMethod 

//The trim() method removes whitespace from both ends of a string.
{
	public static void main(String[] args) 
	{

		String s=" hello java string ";
		//System.out.println(s+"java program"); // without trim

		//System.out.println(s.trim()+"java program");// with trim

		System.out.println(s.length());
		System.out.println(s);       // without trim

		System.out.println("........................");

		String s1 = s.trim();
		System.out.println(s1.length());
		System.out.println(s1);     // with trim    
		System.out.println("***************");  
		String s2 = s.strip();
		System.out.println(s2.length());
		System.out.println(s2);
	}
}
