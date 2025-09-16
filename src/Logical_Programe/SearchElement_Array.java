package Logical_Programe;

import java.util.Scanner;

public class SearchElement_Array {
/*
	Statement: ​Find all indices of a user-specified element 
	in an array, or display "element not found" if it's absent.
 */
	public static void main(String[] args) {
		int[] ar = {1,3,3,4,5,6,6,7,8,9,9};

		System.out.print("Enter the element to search: ");
		Scanner sc =new Scanner(System.in);
		int searchElement = sc.nextInt();
		sc.close();

		boolean found = false;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==searchElement)
			{
				System.out.println("Element found at indexs: "+i);
				found=true;
			}
		}

		if(!found)
		{
			System.out.println("Element not found");
		}

	}

}
