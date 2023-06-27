package inheritance;

public class HDFCMumbai extends HDFC
{
	int dp;
	
	public HDFCMumbai()
	{
		
	}

	public HDFCMumbai(int accno,String bName,int amount,int dp) {
		super(accno,bName,amount);
		this.dp = dp;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}

	@Override
	public String toString() {
		return super.toString()+"HDFCMumbai [dp=" + dp + "]";
	}
	

}
