package Casting;

public class TestDownCasting1

{
	public static void main(String[] args) 
	
	{
		grand_father1 f1 = new son1();
		son1 s2 = (son1)f1;
		 s2.home();
		 s2.money();
		 s2.car();
		 s2.bike();
		 s2.mobile();
		 
		 System.out.println("................");
		 
		 father1 f2=new son1();
		 son1 s3=(son1)f2;
		 s3.home();
		 s3.money();
		 s3.car();
		 s3.bike();
		 s3.mobile();
		 
		
	}

}
