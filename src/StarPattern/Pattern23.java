package StarPattern;

public class Pattern23 {

	public static void main(String[] args) {
/*	    *
		**
		* *
		*  *
		*****
*/
		
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				if(r==1 || c==1 || c==r || r==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();		
			
		}


		
		
		
		
		
		
		
		
	}

}
