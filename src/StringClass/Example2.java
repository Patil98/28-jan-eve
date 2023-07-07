package StringClass;

public class Example2 

{
	public static void main(String[] args) 
	{
		// object creation of String Without new Keyword---->> Constant pool Area
		
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		
		// object creation of String using new Keyword ----->>> non-Constant pool Area
		
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		
		System.out.println(s1==s2);        //true
		System.out.println(s2==s3);       // false
		System.out.println(s1==s4);       // false
		System.out.println(s4==s5);       // false
	}

}
