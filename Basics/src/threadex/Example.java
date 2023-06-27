package threadex;

public class Example implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hai");
	}

	public static void main(String[] args) {
		Example e=new Example();
		Thread t=new Thread(e);
		t.start();

	}

	
}
