package exceptionhandling;

public class Student
{
	private int id;
	private String name;
	private int m1,m2,m3,m4,m5;
	public Student()//default
	{
		
	}
	public Student(int i,String j,int k,int l,int m,int n,int o)
	{
		id=i;//1001
		name=j;//sathya
		m1=k;//67
		m2=l;//88
		m3=m;//99
		m4=n;//77
		m5=o;//99
	}
	public double percentage()
	{
		int total=m1+m2+m3+m4+m5;
		return (total*100)/500.0;
	}
	public void setId(int id)//1003
	{
		this.id=id;//1003
	}
	public int getId()
	{
		return id;//1003
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setM1(int m1)
	{
		this.m1=m1;
	}
	public int getM1()
	{
		return m1;
	}
	public void setM2(int m2)
	{
		this.m2=m2;
	}
	public int getM2()
	{
		return m2;
	}
	public void setM3(int m3)
	{
		this.m3=m3;
	}
	public int getM3()
	{
		return m3;
	}
	public void setM4(int m4)
	{
		this.m4=m4;
	}
	public int getM4()
	{
		return m4;
	}
	public void setM5(int m5)
	{
		this.m5=m5;
	}
	public int getM5()
	{
		return m5;
	}
	
public String toString()
{
	return "id=:"+id+"\nName=:"+name+"\nm1=:"+m1+"\nM2=:"+m2+"\nM3=:"+m3+"\nM4=:"+m4+"\nM5=:"+m5+"\nPercentage=:"+percentage();
}
}