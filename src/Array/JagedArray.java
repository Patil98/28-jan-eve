package Array;

public class JagedArray 
{

	public static void main(String[] args) 
	{
		//1
	    //23
		//456
		//78910
		
		int ar[][]= {{1},{2,3},{4,5,6},{7,8,9,10}};
		
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
	}

}
