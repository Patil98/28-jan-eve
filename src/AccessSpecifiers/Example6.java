package AccessSpecifiers;

public class Example6           // protected access specifier (Example6 and Example7 and Example8)



{
	protected int c;
	
	 protected Example6()
	
	 {
		c=10;
	}

	 protected void printsquarenum()
	 {
		 System.out.println(c*c);
	 }
	 public static void main(String[] args) 
	 {
		 Example6 s6 = new Example6();
		 System.out.println(s6.c);
		s6.printsquarenum();
	}
	 
}  
