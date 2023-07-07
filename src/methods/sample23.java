package methods;

public class sample23
    //non-static regular method call from same class
{
  public static void main(String[] args)
  
  {
	 System.out.println("velocity");
	  sample23 s23 = new sample23();
	  s23.m6();
		s23.m6();	  
      s23.m7();
      s23.m7();
  }
  
  public void m6()
  {
	  System.out.println("running non-static regular method m6 from same class");
  }
  
   public void m7()
   {
	   System.out.println("running non-static regular method m7 from same class");
   }
}
