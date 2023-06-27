package fileshandling;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		File f=new File("newc.txt");
		if(f.createNewFile())
		{
			System.out.println("created successfully");
		}
		else
		{
			System.out.println("files already exists");
		}

	}

}
