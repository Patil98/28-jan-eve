package Logical_Programe;

public class moveZerosToEnd_or_First {

	public static void main(String[] args) {
		int[] ar = {0, 1, 0, 3, 12, 0, 5, 0};
		
		int left=0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]!=0)
			{
				int temp=ar[left];
				ar[left]=ar[i];
				ar[i]=temp;
				
				left++;
			}
		}
		
		for(int a:ar)
		{
			System.out.print(a+" ");
		}
				
				
		

	}

}
