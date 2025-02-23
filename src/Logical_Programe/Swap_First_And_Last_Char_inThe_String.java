package Logical_Programe;

public class Swap_First_And_Last_Char_inThe_String {
	public static void main(String[] args) {
		String str = "bhushan Patil";

		char[] sr = str.toCharArray();

		for(int i = 0; i <= sr.length - 1; i++) {
			int k = i;
			while(i < sr.length && sr[i] != ' ') {
				i++;
			}
			char temp = sr[k];
			sr[k] = sr[i - 1];
			sr[i - 1] = temp;
		}
		System.out.println(sr);
	}

}
