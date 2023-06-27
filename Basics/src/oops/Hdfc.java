package oops;

public class Hdfc implements Bank
{

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}

	@Override
	public void withdraw() {
           System.out.println("withdraw");		
	}

}
