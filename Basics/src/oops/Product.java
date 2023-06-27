package oops;

public class Product 
{
	private int pId;
	private String pName;
	private int availableStock;
	private float price;
	public Product()
	{
		
	}
	public Product(int i,String j,int k,float l)
	{
		pId=i;
		pName=j;
		availableStock=k;
		price=l;
		
	}
	public void setPID(int pId)
	{
		this.pId=pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getpId()
	{
		return pId;
		
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", availableStock=" + availableStock + ", price=" + price
				+ "]";
	}
	

}
