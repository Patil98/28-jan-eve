package Array;

public class example7_StringArrayDeclaration_InitializationInSingleStep

{
public static void main(String[] args) 
{
	String ar []= {"bhushan","abhay","suresh","mahesh","savita"};
	
	
	System.out.println(ar.length);    // 5
	
	System.out.println(ar[2]);          //suresh
	
	System.out.println("---------print all data----------");
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
}
}
