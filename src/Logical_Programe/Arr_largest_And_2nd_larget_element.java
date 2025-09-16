package Logical_Programe;

public class Arr_largest_And_2nd_larget_element {

	public static void main(String[] args) {

		int[] arr = {90,20,30,40,50,60};

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> largest)
			{
				secondLargest =largest;
				largest=arr[i];

			}

		}
		System.out.println("2nd largest -> "+secondLargest);

		System.out.println("largest -> "+largest);

	}

}
