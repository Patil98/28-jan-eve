package bhushan;

import java.util.HashMap;
import java.util.Set;

public class OccurnceOfWord 
{
	public static void main(String[] args)
	{
		String s="bhushan patil patil bhushan";
		String[] ar = s.split(" ");
		HashMap<String, Integer>ha = new HashMap();

		for(int i=0; i<ar.length; i++)
		{
             String sh = ar[i];
             
             if(ha.containsKey(sh))
             {
            	 ha.put(sh, ha.get(sh)+1);
             }
             else
             {
            	 ha.put(sh, 1);
             }

		}
		
		
		Set<String> all = ha.keySet();
		for(String key:all)
		{
			System.out.println(key+"-"+ha.get(key));
		}
		
		


	}

}
