package bhushan;

public class revers_String1 

{
public static void main(String[] args) 

{
      String org= "nahsuhb";             // 0,1,2,3,4,5,6
	  String rev= "";
	
	        
	for(int i=org.length()-1; i>=0; i--)
	{
		
		rev=rev+org.charAt(i);       
		
	}
	
	System.out.println("orignal String = "+  org);
	System.out.println("revers string  = "+ rev);
}
	
	
	
}
