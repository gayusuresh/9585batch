package collection;

public class Orders 
{
	private int oid;
	private String oname;
	private int nooforders;
	public Orders()
	{
		
	}
	
	public Orders(int oid, String oname, int nooforders) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.nooforders = nooforders;
	}
	
	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public int getNooforders() {
		return nooforders;
	}

	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", oname=" + oname + ", nooforders=" + nooforders + "]";
	}
}
