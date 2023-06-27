package HybridUsinginterface;

public class D implements B,C
{

	@Override
	public void a() {
		System.out.println("a");
		
	}

	@Override
	public void c() {
		System.out.println("C");
		
	}

	@Override
	public void b() {
		System.out.println("b");
		
	}

}
