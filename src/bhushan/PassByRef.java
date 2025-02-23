package bhushan;

public class PassByRef 
{
	String name;
	int age;
	
	public static void main(String[] args) 
	{
		PassByRef p = new PassByRef();
		p.name="bhushan";
		p.age=10;
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		PassByRef s;
		s=p;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		s.name="anil";
		s.age=20;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		System.out.println(p.name);
		System.out.println(p.age);
	
	}

}
