package AccessSpecifiers;

public class Example9       // public access specifier

{

	 public int d;
	 
	public Example9()
	 {
		 d=5;
	 }
	
	public void printcubesnum()
	{
		System.out.println(d*d*d);
	}
	
	public static void main(String[] args) 
	{
		Example9 s9 = new Example9();
		System.out.println(s9.d);
		s9.printcubesnum();
		
	}
}
