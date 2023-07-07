package Logical_Programe;

public class Duplicate_num_in_intArray 

{
	
	public static void main(String[] args) 
	{
		int ar[]= {10,20,30,10,20,30,40,50};
		
	System.out.println("duplicate num in above int array are : "); 
		
	  for(int i=0; i<ar.length; i++)
	  {
		  for(int j=i+1; j<ar.length; j++)
		  {
			  if(ar[i]==ar[j])
			  {
				  System.out.println(ar[j]+" ");
			  }
			
			  
		  }
		
	}

}
}