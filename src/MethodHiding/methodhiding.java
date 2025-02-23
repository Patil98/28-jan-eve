package MethodHiding;

public class methodhiding
{
	public static void main(String[] args) 
	{
		ChildClass cc = new ChildClass();
		cc.M1();  // method from ChildClass
		
		ChildClass.M1();
	
		ParentClass pc = new ParentClass();
		pc.M1(); // method from ParentClass
		
		ParentClass.M1();
		
		ParentClass p=new ChildClass();
		p.M1(); //method from ParentClass
		
	}

}
