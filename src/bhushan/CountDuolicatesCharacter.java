package bhushan;

public class CountDuolicatesCharacter
{

	public static void main(String[] args) 
	{
		String  s="bhushan patil";
		char[] ch = s.toCharArray();
		
		int count=0;
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; i<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		

	}

}
