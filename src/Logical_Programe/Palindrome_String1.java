package Logical_Programe;

public class Palindrome_String1 
{
	public static void main(String[] args) 
	{
		String str="dad mom dad";
		String ar []=str.split(" ");

		for(int i=0; i<ar.length; i++)
		{
			String org = ar[i];
			String rev="";
			for(int j=org.length()-1; j>=0; j--)
			{
				rev+=org.charAt(j);
			}
			if(org.equals(rev))
			{
				System.out.println(org+" palindrome");
			}
			else
			{
				System.out.println(org+" not palindrome");
			}
		}
	}
}

