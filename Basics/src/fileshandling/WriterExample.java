package fileshandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("d:/newB.txt");
		
		fw.write("hello");
		fw.close();

	}

}
