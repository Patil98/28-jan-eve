package constructor;

public class Example9  
{

	String name;
	int salary;
	
	Example9(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	/*public void call() 
	{
		System.out.println(name+"->"+salary);
	}*/
	
	public static void main(String[] args) 
	{
		Example9 e = new Example9("bhushan", 60000);
		System.out.println(e.name+"->"+e.salary);
		//e.call();
		
		Example9 e1 = new Example9("anil", 70000);
		System.out.println(e1.name+"->"+e1.salary);
		//e1.call();
		
		
	}



}
