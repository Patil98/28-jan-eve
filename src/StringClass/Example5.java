package StringClass;

public class Example5 

{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="";
		String s3="abcd";
		String s4="ABCD";
		String s5="my name is bhushan";
		String s6="abcdabc";
		String s7="this is demo";
		
		
	String ar []=s1.split("o");
	System.out.println(ar[0]);
	System.out.println(ar[1]);
		
		
		System.out.println("**************");
		System.out.println(s5.replace("bhushan", "amol"));
         //s5=s5.replace("bhushan", "amol");
		
		System.out.println("...................................");
		
		//System.out.println(s7.replaceFirst("is", "was"));
		System.out.println(s7.replace("is", "was"));
		
		System.out.println(s7.replaceAll("is(.)", "was"));
		System.out.println(s7.replaceAll("is(.*)", "was"));
		
		System.out.println("----------------------");
		
		System.out.println(s3.concat(s4));         //abcdABCD
		System.out.println(s3+s4);                //abcdABCD
	
		System.out.println("-------------------");
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 6));
		
		System.out.println("----------------------------");
		
		System.out.println(s5.endsWith("bhushan"));         //true
		
		System.out.println(s5.startsWith("my"));               //true
		
		System.out.println("-------------------------");
		
		System.out.println(s6.indexOf('d'));
		
		System.out.println(s6.lastIndexOf('b'));
		
		System.out.println("-----------------------");
		
		System.out.println(s6.charAt(4));


		
	
		
	}

	
}
