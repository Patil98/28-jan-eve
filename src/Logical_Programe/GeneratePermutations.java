package Logical_Programe;

public class GeneratePermutations {

	
	public static void permutation(String sr,String prefix)
	{
		if(sr.length()==0)
		{
			System.out.println(prefix);
		}
		
		for(int i=0; i<sr.length(); i++)
		{
			char ch=sr.charAt(i);
			String remaining=sr.substring(0,i)+sr.substring(i+1);
			permutation(remaining, prefix+ch);
			
		}
	}
	
	public static void main(String[] args) {
	
		String s="ABCD";
		String prefix="";
		
		permutation(s, prefix);

	}

}
