package inheritance;

public class HDFC extends Bank
{
	private int amount;
	
	public HDFC()
	{
		
	}

	public HDFC(int accno,String bName,int amount)
	{
		super(accno,bName);
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return super.toString()+"HDFC [amount=" + amount + "]";
	}
	
	
	

}
