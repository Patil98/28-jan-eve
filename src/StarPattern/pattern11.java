package StarPattern;

public class pattern11 
{	
public static void main(String[] args) 
{
	//    *
	//   **
	//  ***
	// ****
	//*****
	// ****
	//  ***
	//   **
	//    *
	
	int star=1;
	int space=4;
	
	for(int i=1; i<=9; i++)
	{
		for(int k=1; k<=space; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		 
		if(i<=4)
		{
			star++;
			space--;
		}
		else
		{
			star--;
			space++;
		}
			
	}
	
	
}	

}
