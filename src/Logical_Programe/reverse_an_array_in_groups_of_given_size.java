package Logical_Programe;

import java.util.Arrays;

public class reverse_an_array_in_groups_of_given_size
{

	public static void main(String[] args) {
		int ar[]={1,2,3,4,5,6,7,8,9};
		int n=ar.length;
		int k=3;

		for(int i=0; i<n; i+=k)
		{
			int left=i;
			int right=Math.min(i+k-1,n-1);

			while(left<right)
			{
				int t=ar[left];
				ar[left]=ar[right];
				ar[right]=t;

				left++;
				right--;

			}
		}

		System.out.println(Arrays.toString(ar));
	}
}
