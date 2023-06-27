package threadex;

public class DemoEx extends Thread
{
	public void run()//execution//running
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("hai");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}

	public static void main(String[] args) 
	{
		DemoEx d=new DemoEx();//new
		d.setName("first");
		System.out.println(d.getId());
		System.out.println(d.getName());
		d.start();
		d.setPriority(Thread.MIN_PRIORITY);
		System.out.println(d.getPriority());
		DemoEx d1=new DemoEx();//new
		d1.setName("second");
		System.out.println(d1.getId());
		System.out.println(d1.getName());
		d1.start();
		
		d1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(d1.getPriority());
	}

}
