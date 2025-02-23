package bhushan;

public class revers_string 
{
	public static void main(String[] args) 
	{
		String org = "bhushan patil";
		String result="";
		for (int i = 0; i<org.length(); i++) 
		{
			if (!result.contains(String.valueOf(org.charAt(i)))) 
			{
				result+=org.charAt(i);
			}
		}
		  System.out.println(result);
	}

}

