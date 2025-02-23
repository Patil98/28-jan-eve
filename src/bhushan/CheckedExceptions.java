package bhushan;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptions 
{
	public static void main(String[] args)
	{
		try 
		{
		    FileInputStream file = new FileInputStream("C:\\Users\\bvp13\\Downloads\\4[1].docx");
		    file.close();
		} 
		catch (IOException e) 
		{
		    System.out.println("An error occurred: " + e.getMessage());
		}

		
	}

}
