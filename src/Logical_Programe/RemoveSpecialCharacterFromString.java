package Logical_Programe;

public class RemoveSpecialCharacterFromString 
{

	public static void main(String[] args) 
	{
	   String s="java1253 !@#program&^%()856";
	   
	   //String result="";
	   
	   String re = s.replaceAll("[^a-zA-Z0-9' ']", "");
	   System.out.println(re);
	   
	   /*for(int i=0; i<s.length(); i++)
	   {
		   char ch = s.charAt(i);
		   if(Character.isLetterOrDigit(ch))
		   {
			   result+=ch;
		   }
	   }
	   System.out.println(result);*/
	  
	   //count Special character
	   int Specialcharacter = s.replaceAll("[a-zA-Z0-9]", "").length();
	   System.out.println(Specialcharacter);
	
	}

}
