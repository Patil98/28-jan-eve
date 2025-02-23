package Logical_Programe;

public class  ReversTheStringUsingStringBuilder
{
	
	public static void main(String[] args) 
	{
		String s="bhushan patil";
		
		// conversion from String object to StringBuilder
		StringBuilder sb=new StringBuilder(s);
		
		// append a string into StringBuilder sb
		//sb.append(s);
		
		// reverse StringBuilder sb
		sb.reverse();
		
		System.out.println(sb);


		
	}
}
