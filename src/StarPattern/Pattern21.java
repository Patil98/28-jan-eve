package StarPattern;

public class Pattern21 {

	public static void main(String[] args) {
/*	******
	*    *
	*    *
	*    *
	*    *
	******  */

		for(int r=1; r<=6; r++)
		{
			for(int c=1; c<=6; c++)
			{
				if(r==1 || c==1 || c==6 || r==6)
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
