package inheritance;

public class Bank
{
	private int accno;
	private String bName;
	
	public Bank()
	{
		
	}

	

	public Bank(int accno, String bName) {
		super();
		this.accno = accno;
		this.bName = bName;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}
	
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", bName=" + bName + "]";
	}
}
