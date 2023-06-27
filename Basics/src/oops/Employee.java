package oops;

public class Employee 
{
	private int id;
	
	private String name;
	private double salary;
	private static int idgen=1001;
	public Employee()
	{
		id=idgen++;//id=1001 id=1002
	}
	public Employee(String name, double salary) //hari,34000
	{
		this();//default constructor
		
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
