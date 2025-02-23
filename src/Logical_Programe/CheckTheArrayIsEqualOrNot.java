package Logical_Programe;

public class CheckTheArrayIsEqualOrNot
{

	public static void main(String[] args) 
	{
		int ar1[]= {1,2,3,4,5,6};
		int ar2[]= {1,2,3,4,5,6};

		boolean status=true;

		if(ar1.length==ar2.length)
		{
			for(int i=0; i<ar1.length; i++)
			{
				if(ar1[i]!=ar2[i])
				{
					status=false;
				}
			}

		}
		else
		{
			status=false;
		}

		if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}


	}

}
