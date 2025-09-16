package Logical_Programe;

public class rotateclockwise {


	public static void rotateArray(int[] ar, int k)
	{
		if(k==0 || ar.length==0)
		{
			return;
		}
		
		int n=ar.length;
		int temp=ar[n-1];
		
		for(int i=n-1; i>0; i--)   //i=5
		{
			ar[i]=ar[i-1];    //ar[5]=ar[4];
		}
		
		ar[0]=temp;
		
		rotateArray(ar, k-1);


	}

	public static void main(String[] args) {

		int[] arr={1,2,3,4,5,6};
		int k=2;
		
		rotateArray(arr, k);
		
		for(int num:arr)
		{
			System.out.print(num+" ");
		}

	}

}
