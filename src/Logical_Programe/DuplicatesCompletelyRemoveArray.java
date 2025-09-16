package Logical_Programe;

public class DuplicatesCompletelyRemoveArray {

	public static void main(String[] args) {


		int [] ar={12,14,12,4,93,4};

		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			for(int j=0; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ar[i]+" ");
			}
		}

	}
}

