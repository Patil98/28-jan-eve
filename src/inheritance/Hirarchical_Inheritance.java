package inheritance;

public class Hirarchical_Inheritance 

{
public static void main(String[] args) 

{
	System.out.println("features of son 1");
	son1 s1 = new son1();
	s1.bike();
	s1.car();
	s1.money();
	s1.home();
	
	System.out.println("features of son 2");
	son2 s2 = new son2();
	s2.mobile();
	s2.car();
	s2.money();
	s2.home();
	
	System.out.println("features of son 3");
	son3 s3 = new son3();
	s3.laptop();
	s3.car();
	s3.home();
	s3.money();
	
}
}
