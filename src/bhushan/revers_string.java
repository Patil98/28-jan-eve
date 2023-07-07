package bhushan;

public class revers_string 

{
	public static void main(String[] args) 
	{
		
String org ="avaj";           // 0,1,2,3
String rev =" ";            // j

for(int i=org.length()-1; i>=0; i--)
{
	rev=rev+org.charAt(i);
}
System.out.println(rev);

	
	}
}
