package Logical_Programe;

public class remove_Duplicates 
{	
	public static void main(String[] args) 
	{		
		String s="bhushanpatil";
		String result="";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				result+=ch;
			}			
		}
		System.out.println(result);
		
	}

}
