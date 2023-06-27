package sortcollection;

public class Employee implements Comparable<Employee>
{
	private int eId;
	private String eName;
	private float salary;
	public Employee()
	{
		
	}
	public Employee(int eId, String eName, float salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return -(Float.compare(salary, e.getSalary()));
	}

}
