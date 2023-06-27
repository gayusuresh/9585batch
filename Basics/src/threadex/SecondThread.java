package threadex;

public class SecondThread extends Thread
{

	Table t;
	SecondThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
