package Logical_Programe;

//completely remove the duplicates 
public class remove_Duplicates_completely
{	
	public static void main(String[] args) 
	{		
		String s="bhushan patil";
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
