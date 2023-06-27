package threadex;

public class Table 
{
	public synchronized static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
