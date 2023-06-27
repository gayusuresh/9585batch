package inheritance;

public class Programmer extends Employee
{
	private int salary;
	
	public Programmer()
	{
		
	}

	public Programmer(int id,String name,int salary) {
		setId(id);
		setName(name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"Programmer [salary=" + salary + "]";
	}
	

}
