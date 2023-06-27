package fileshandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		Employee emp1=new Employee(12,"gayathri");
		Employee emp2=new Employee(13,"ravi");
		FileOutputStream fout=new FileOutputStream("input.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp1);
		out.writeObject(emp2);
		out.close();
		fout.close();

	}

}
