package Array_Practice;

public class example3_Multi_Dimensional_intArray
{
	
	public static void main(String[] args)
	{
		
		int ar[][]=new int[2][3];
		
		ar[0][0]=10;
		ar[0][1]=50;
		ar[0][2]=40;			
		ar[1][0]=20;
		ar[1][1]=60;
		ar[1][2]=30;
		
		
		System.out.println(ar.length);
		System.out.println(ar[0][1]);
		
		System.out.println("---print all data ---");
		
		
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
