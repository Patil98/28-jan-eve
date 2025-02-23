package Logical_Programe;

public class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		String org ="bhushan patil";
		String result="";
		
		for(int i=0; i<org.length(); i++) 
		{
			char ch = org.charAt(i);
			if(!result.contains(String.valueOf(ch))) 
			{
				result+=ch;
			}
		}
		System.out.println(result);
	}

}

