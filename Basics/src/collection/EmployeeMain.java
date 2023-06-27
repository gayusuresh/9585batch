package collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) throws NotEligibleForManagerException {
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
		System.out.println("=================================");
		lowSalary(list);
		System.out.println("================================max salary");
		float max=e1.getSalary();
		for(int i=0;i<list.size();i++)//0<3
		{
		if(max<e2.getSalary())//23000<64000
		{
			max=e2.getSalary();//max=64000
		}
		if(max<e3.getSalary())//64000<54000
		{
			max=e3.getSalary();
		}
		}
		System.out.println("The Max salary=:"+max);//64000
		
	}
	public static void lowSalary(List<Employee>list) throws NotEligibleForManagerException
	{
		
		for(Employee e:list)
		{
			if(e.getSalary()<20000)
			{
				throw new NotEligibleForManagerException("not eligible for manager");
			}
			else
			{
				System.out.println(e.geteName()+" \n"+e.getSalary());
			}
		}
	}

}
