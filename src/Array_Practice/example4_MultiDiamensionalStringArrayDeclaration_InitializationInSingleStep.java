package Array_Practice;

public class example4_MultiDiamensionalStringArrayDeclaration_InitializationInSingleStep 
{

	public static void main(String[] args)
	{
		
	String ar[][] = {{"anil","bhushan"},{"amol","shubham"}};
	
	System.out.println(ar[0][1]);
	
	System.out.println("---print all data---");
	
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.print(ar[i][j]+"  ");
		}
		System.out.println();
	}
	
	
	
	}
	
}
