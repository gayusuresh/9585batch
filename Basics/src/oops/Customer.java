package oops;

public class Customer 
{
	private int id;
	private String cname;
	public Customer()//inside the compiler automatically create and initializze the default
	//values
	{
		id=0;
		cname=null;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(cname);
	}

}
