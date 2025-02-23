package Logical_Programe;

public class two_array 
{
	public static void main(String[] args)
	{

		int [] ar1= {10,20,30,40,100};
		int [] ar2= {10,20,70,80,100};

		//           4<=4
		for(int i=0; i<ar1.length; i++)
		{  //     100 != 100
			if(ar1[i]!=ar2[i])
			{                       // 40   80    
				System.out.println(ar1[i]+" "+ar2[i]);
			}
		}	
	}
}



