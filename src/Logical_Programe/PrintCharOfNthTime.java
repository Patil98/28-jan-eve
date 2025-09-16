package Logical_Programe;

public class PrintCharOfNthTime {

	public static void main(String[] args) {
		String s="a2b3c4";
		
		for(int i=0; i<s.length(); i+=2)
		{
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			int n=ch1-48;
			
			for(int j=1; j<=n; j++)
			{
				System.out.print(ch);
			}
		}
		
		

	}

}
