package fileshandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("input.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Employee e=(Employee) oin.readObject();
		System.out.println(e.getEname());
		System.out.println(e.getId());
		Employee e1=(Employee) oin.readObject();
		System.out.println(e1.getEname());
		System.out.println(e1.getId());
		
	
	

	}

}
