package bhushan;

public class SeparateLowerCaseUpperCase
{

	public static void main(String[] args) 
	{
		String s = "bhUsHan PaTIl";

		//Separate and print lowercase letters
		System.out.print("Lowercase letters: ");
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
			{
				System.out.print(c);
			}
		}

		System.out.println();   //Print a newline

		//Separate and print uppercase letters
		System.out.print("Uppercase letters: ");
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) 
			{
				System.out.print(c);
			}
		}

	}

}
