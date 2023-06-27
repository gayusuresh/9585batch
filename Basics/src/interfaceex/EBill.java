package interfaceex;

public class EBill implements Bill
{
	private int noofuints;
	private int costperunit;
	
	public EBill()
	{
		
	}
	

	public EBill(int noofuints, int costperunit) {
		super();
		this.noofuints = noofuints;
		this.costperunit = costperunit;
	}


	public int getNoofuints() {
		return noofuints;
	}

	public void setNoofuints(int noofuints) {
		this.noofuints = noofuints;
	}

	public int getCostperunit() {
		return costperunit;
	}

	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}


	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return noofuints*costperunit;
	}


	@Override
	public void billDisplay() {
		System.out.println("The EBill is=:"+calculateBill());
		
	}

}
