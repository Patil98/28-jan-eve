package bhushan;

public class PassByReferance 
{
	 String name;
	 int id;
	
	public static void main(String[] args) 
	{
		PassByReferance ps = new PassByReferance();
        ps.name="bhushan";
        ps.id=101;
        
        System.out.println(ps.name);
        System.out.println(ps.id);
        
        PassByReferance sp;
        sp=ps;
        
        System.out.println(sp.name);
        System.out.println(sp.id);
        
        sp.name="kuldeep";
        sp.id=102;
        
        System.out.println(sp.name);
        System.out.println(sp.id);
        
        System.out.println(ps.name);
        System.out.println(ps.id);
	}

}
