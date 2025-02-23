package Logical_Programe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromTxtFile
{

	public static void main(String[] args) throws Exception
	{
		//Approach-1   using FileReader And BufferReader class

		/*FileReader rd=new FileReader("D:\\Data.txt");

		BufferedReader br = new BufferedReader(rd);
		String st;

		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}
		 */

		//Approach-2

		File file = new File("D:\\Data.txt");

		Scanner sc = new Scanner(file);

		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/

		
		//Approach-3

		sc.useDelimiter("\\z");
		System.out.println(sc.next());


	}

}
