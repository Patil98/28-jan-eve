package Logical_Programe;

public class SortStringArray {

	public static void main(String[] args) throws Exception {
		String[] ar = {"Pineapple", "Banana", "Grapes", "Orange", "Mango", "Apple"};

		for (int i = 0; i <ar.length; i++) {
			for (int j = i+1; j <ar.length; j++) {

				if (ar[i].compareToIgnoreCase(ar[j]) > 0) {

					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println(ar[i]);
		}

	}
}
