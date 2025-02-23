package Logical_Programe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTxtFile 
{

	public static void main(String[] args) throws Exception 
	{
		FileWriter file = new FileWriter("D:\\write.txt");
		
		BufferedWriter bw = new BufferedWriter(file);

		bw.write("selenium with java \n");
		bw.write("selenium with pythan \n");
		bw.write("selenium with c#");
		
		bw.close();
		
		file.close();
		
		System.out.println("finished!!!");
		
		
	}

}
