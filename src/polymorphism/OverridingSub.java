package polymorphism;

public class OverridingSub extends OveridingSuper
{
	public void m1()
	{
		super.m1();

		System.out.println("m1 from sub class");
	}
	
	public void m2()
	{
		System.out.println("m2 from sub class");
	}


	public void m3()
	{
		System.out.println("m3 from sub class");
	}
	
	public static void main(String[] args)
	{
		OverridingSub ri = new OverridingSub();
		ri.m1();
		ri.m2();
		ri.m3();
	
		
		
/*		OveridingSuper ov = new OveridingSuper();
		ov.m1();
		ov.m2();
		ov.m3();
		
		
		OveridingSuper o=new OverridingSub();
		o.m1();
		o.m2();
		o.m3();
		
		
		OveridingSuper r=new OverridingSub();
		OverridingSub su= (OverridingSub)r;
		su.m1();
		su.m2();
		su.m3();
		su.m4();*/
		 	
	}	
}
