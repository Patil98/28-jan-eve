package Logical_Programe;

public class RotateClockWiseUsingReversed {

	public static void revers(int[] ar, int start, int end)
	{
		while(start<end)
		{
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			
			start++;
			end--;
		}
	}
	
	public static void rorate(int[] ar,int k)
	{
		
		int n=ar.length;
		
		if(k==0 || ar.length==0)
		{
			return;
		}
		
		revers(ar, 0, n-1); 
		revers(ar, 0, k-1);	
		revers(ar, k, n-1);

	}

	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,5,6};
		int k=2;
		
		rorate(ar, k);
		
		for(int num:ar)
		{
			System.out.print(num+" ");
		}
	}

}
