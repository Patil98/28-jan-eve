package useofstatic_nonstaticmethod;

public class Emp

{
	String empname;
	int empID;
	static String empCEOname;
	//String empCEOname;	
	public void empinfo()
	{
		System.out.println(empname+"  : "+empID +" : "+empCEOname );
	}

	
}
