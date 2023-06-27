package oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee("hari",34000.5);
		Employee e2=new Employee("gayathri",90000.3);
		System.out.println(e1);
		System.out.println(e2);
		Employee e3=new Employee();
		e3.setId(1003);
		e3.setName("kaviya");
		System.out.println(e3.getId());
		System.out.println(e3.getName());

	}

}
