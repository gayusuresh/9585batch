package interfaceex;

public class WBill implements Bill
{
	private int costperlitre;
	private int nooflitre;
	public WBill()
	{
		
	}
	public WBill(int costperlitre, int nooflitre) {
		super();
		this.costperlitre = costperlitre;
		this.nooflitre = nooflitre;
	}
	public int getCostperlitre() {
		return costperlitre;
	}
	public void setCostperlitre(int costperlitre) {
		this.costperlitre = costperlitre;
	}
	public int getNooflitre() {
		return nooflitre;
	}
	public void setNooflitre(int nooflitre) {
		this.nooflitre = nooflitre;
	}
	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return nooflitre*costperlitre;
	}
	@Override
	public void billDisplay() {
		System.out.println("The Water Bil is=:"+calculateBill());
		
	}
	
	

}
