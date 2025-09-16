package Logical_Programe;

import java.util.Arrays;

public class ArrayReverse_UsingTwoPointerApproach {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};  // Original array

		int left = 0;                  // Initialize left pointer
		int right = arr.length - 1;    // Initialize right pointer

		while (left < right) {
			// Swap elements at left and right pointers
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			// Move pointers towards each other
			left++;
			right--;
		}

		System.out.println(Arrays.toString(arr)); // Print the reversed array

	}

}
