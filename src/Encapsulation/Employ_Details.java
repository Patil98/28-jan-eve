package Encapsulation;

public class Employ_Details 
{

	public static void main(String[] args) 
	{
		Employee em = new Employee();
		
		//set the details
		em.setName("bhushan");
		em.SetEmploy_id(101);
		em.setName("patil");
				
		//get the details
		String name = em.getName();
		System.out.println(name);
		int employ_id = em.getEmploy_id();
		System.out.println(employ_id);
		
	}
	
	
	
}

