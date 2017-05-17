package ioclasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Notes:
The Java I/O package, a.k.a. java.io, provides a set of input streams and a set of output streams
used to read and write data to files or other input and output sources. 
There are three categories of classes in java.io: input streams, output streams and everything else.
*/

//Following class has methods to read from file and write to file

public class IOClassesDemo{
	
	void readFromFileByteStream()
	{
		try
		{
			File file = new File("C:\\Temp\\File.txt");
			
			if(file.exists() && file.isFile())
			{
				//Byte Stream
				FileInputStream fis = new FileInputStream(file);
				int i = 0;
				while((i = fis.read()) !=-1) // -1 is eof - end of file
				{
					System.out.print((char)i);
				}
				
				fis.close();
				System.out.println();
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	void readFromFileCharacterStream()
	{
		try
		{
			File file = new File("C:\\Temp\\File.txt");
			
			if(file.exists() && file.isFile())
			{
				//Character stream - reading line by line
				FileReader reader = new FileReader(file);
				BufferedReader bReader = new BufferedReader(reader);
				
				String line = "";
				while((line = bReader.readLine()) != null)
				{
					System.out.println(line);
				}
				
				bReader.close();
				System.out.println();
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	//function to copy contents of one file to another file
	void writeToFile()
	{
		try
		{
			File fileToRead = new File("C:\\Temp\\File.txt");
			File fileToWrite = new File("C:\\Temp\\OutputFile.txt");
			
			if(fileToRead.exists() && fileToRead.isFile())
			{
				//Byte Stream
				FileInputStream fis = new FileInputStream(fileToRead);
				
				if(!fileToWrite.exists())
				{
					fileToWrite.createNewFile();
				}
				
				FileOutputStream fos = new FileOutputStream(fileToWrite);
						
				int i = 0;
				while((i = fis.read()) !=-1) // -1 is eof - end of file
				{
					fos.write((char)i);
				}
				
				fis.close();
				fos.close();
				
				System.out.println("Data written to file");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {

		IOClassesDemo ioRef = new IOClassesDemo();
		
		ioRef.readFromFileByteStream();
		System.out.println();
		ioRef.readFromFileCharacterStream();
		System.out.println();
		ioRef.writeToFile();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bReader= new BufferedReader(isr);
		
		System.out.println("Enter some text");
		String line="";
		try 
		{
			line = bReader.readLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(line);
		
		int a=0,b=0,c=0;
		
		System.out.println("Enter Number a");
		try {
			a = Integer.parseInt(bReader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter Number b");
		try {
			b = Integer.parseInt(bReader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter Number c");
		try {
			c = Integer.parseInt(bReader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("a = "+a +"\nb = "+b +"\nc = "+c);
	}	
}
