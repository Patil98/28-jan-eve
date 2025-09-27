package Logical_Programe;

public class find_the_subsequent_letter {

	public static void main(String[] args) {
		String s="ndhydabcihd";
		StringBuilder sb = new StringBuilder();
		String temp="";


		for(int i=0; i<s.length(); i++)
		{
			if(temp.length()==0)
			{
				temp+=s.charAt(i);
			}
			else
			{
				char prev=temp.charAt(temp.length()-1);
				char curr=s.charAt(i);
				if(curr==prev+1)
				{
					temp+=curr;
				}
				else
				{
					if(temp.length()>=2)
					{
						sb.append(temp.toString()+" ");	
					}
					temp="";
					temp+=curr;

				}
			}
		}

		if(temp.length()>=2)
		{
			sb.append(temp.toString());
		}

		// Print the output
		System.out.println("Input: " + s);
		System.out.println("Output: " + sb);


	}

}
