package StarPattern;

public class Pattern22 {

	public static void main(String[] args) {
		//	      *
		//	     * *
		//	    *   *
		//	   *     *
		//	  *       *
		//	 ***********

		int star=1;
		int space=5;

		for(int r=1; r<=6; r++)
		{
			for(int s=1; s<=space; s++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=star; c++)
			{
				if(c==1 || c==star || r==6)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();

			star=star+2;
			space--;
		}

	}

}
