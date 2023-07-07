package useofstatic_nonstaticmethod;

public class Emplyinfo 

{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		e1.empname="bhushan";
		e1.empID=101;
		//e1.empCEOname="abc";
			Emp.empCEOname="abc";
	
		Emp e2 = new Emp();
		e2.empname="anil";
		e2.empID=102;
		Emp.empCEOname="abc";
		//e2.empCEOname="abc";
		
		Emp e3 = new Emp();
		e3.empname="aakash";
		e3.empID=103;
		Emp.empCEOname="lmn";
		//e3.empCEOname="lmn";
		
		e1.empinfo();
		e2.empinfo();
		e3.empinfo();
		
	}

}
