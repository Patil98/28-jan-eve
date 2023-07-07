package methods;

public class sample37_method_with_all_parameter 

{
public static void main(String[] args)

{
studentinfo("anil", 115, 80.5f, 'a');

sample37_method_with_all_parameter s37 = new sample37_method_with_all_parameter();
s37.name("anil");

}
public static void studentinfo (String name,int rollnum,float per,char grade)
	
{
System.out.println(name);
System.out.println(rollnum);
System.out.println(per);
System.out.println(grade);

}
 public  void name(String studentname)
 
 {
System.out.println(studentname);	
}
}
