package Logical_Programe;

public class ReversTheStringUsingStringBuffer 
{
	public static void main(String[] args) 
	{
		String s="bhushan patil";
		
		// conversion from String object to StringBuffer
		StringBuffer sb=new StringBuffer(s);
	
		// To reverse the string
        sb.reverse();
       
        System.out.println(sb);	
	}	
}
