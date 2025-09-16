package Logical_Programe;

public class SumFromString {

	public static void main(String[] args) {
		String input = "a1b2c3d4";  // Example input
		int sum = 0;

		// Iterate through each character in the string
		for (char ch : input.toCharArray()) {
			// Check if the character is a digit
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);  // Convert char to int and add to sum
			}
		}

		System.out.println(sum);


	}

}
