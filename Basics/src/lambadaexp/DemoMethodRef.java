package lambadaexp;

public class DemoMethodRef
{
	DemoMethodRef()
	{
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		Demo d=()->System.out.println("hai");
		d.display();
		
		//DemoMethodRef ref=new DemoMethodRef();
	//	ref.displayAll();(old tech)
		//DemoMethodRef ref=new DemoMethodRef();
		Demo d1=DemoMethodRef::new;
		d1.display();
		
	}

}
