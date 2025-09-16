package Logical_Programe;

public class OccurenceOfStringWithoutHashMap {

	public static void main(String[] args) {
		String s="aabbbcccc";
		int[] ar=new int[256];


		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			int n=ch;
			ar[n]++;

		}
		
		for(int j=0; j<ar.length; j++)
		{
			if(ar[j]!=0)
			{
				System.out.println((char)j+":"+ar[j]);
			}
		}

	}

}
