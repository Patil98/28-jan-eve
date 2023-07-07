package bhushan;

public class TestDowncasting 


{
	public static void main(String[] args)
	
	{
		father p=new son();
		son s1=(son)p;
		s1.farm();
		s1.money();
		s1.car();
		s1.home();
		s1.laptop();
		
	}
	

}
