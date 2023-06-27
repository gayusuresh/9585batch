package sortcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1001,"gayathri",23000.5f);
		Employee e2=new Employee(1002,"ravi",64000.5f);
		Employee e3=new Employee(1003,"hari",54000.5f);
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for(Employee e:list)
		{
			System.out.println(e);
		}
	System.out.println("=============sort");
	Collections.sort(list);
	for(Employee e:list)
	{
		System.out.println(e);
	}
}
}