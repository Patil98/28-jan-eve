package Logical_Programe;

public class Max_MinSum_SubArray {

	public static void main(String[] args) {
		int[] ar= {1,3,4,5,6,7};
		int k=3;
		int n=ar.length;
		
		
		if(n<k)
		{
			System.out.println("arrays length must atleast k");
			return;
		}
		
		
		int window_sum=0,max_sum=0;
			
		for(int i=0; i<k; i++)
		{
			window_sum+=ar[i];
		}
		
		max_sum=window_sum;
				
		for(int j=k; j<n; j++)
		{
			window_sum+=ar[j]-ar[j-k];
			max_sum=Math.min(max_sum,window_sum);
		}
		
		System.out.println("max sum of subarray:"+max_sum);

	}

}
