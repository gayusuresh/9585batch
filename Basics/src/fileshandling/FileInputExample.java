package fileshandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) throws IOException {
		FileReader fin=new FileReader("d:/newA.txt");
		BufferedReader br=new BufferedReader(fin);
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)i);
		}
		

	}

}
