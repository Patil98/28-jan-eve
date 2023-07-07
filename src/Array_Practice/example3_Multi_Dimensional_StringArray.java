package Array_Practice;

public class example3_Multi_Dimensional_StringArray 
{
	
	public static void main(String[] args)
	{
		
		String ar[][]=new String[2][3];
		
		ar[0][0]="bhushan";
		ar[0][1]="anil";
		ar[0][2]="atul";			
		ar[1][0]="amol";
		ar[1][1]="dheeraj";
		ar[1][2]="shubham";
		
		
		System.out.println(ar[1][0]);
		System.out.println(ar.length);
		
		System.out.println("--print all data---");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
