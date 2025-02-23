package Encapsulation;

public class Employee 
{
	private String name;
	private int emp_id;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void SetEmploy_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	
	public int getEmploy_id()
	{
		return emp_id;
	}

}
