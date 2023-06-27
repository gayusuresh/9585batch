package fileshandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutputExample {

	public static void main(String[] args) throws IOException 
	{

		FileOutputStream fout=new FileOutputStream("d:/newA.txt");
		String s="Hello";
		byte  b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("files created");

	}

}
