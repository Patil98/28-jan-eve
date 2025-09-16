package StarPattern;

public class Pattern25 {


	public static void main(String[] args) {

		//		    1 
		//		   2 2 
		//		  3 3 3 
		//		 4 4 4 4 
		//		5 5 5 5 5


		int num=1;
		int space=4; 

		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=space; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=num; j++)
			{
				System.out.print(num+" ");		
			}
			System.out.println();

			num++;
			space--;
		}
	}
}
