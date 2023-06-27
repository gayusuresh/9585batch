package oops;

public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product(1001,"chair",45,2000.4f);
		Product p2=new Product(1001,"chair",45,2000.4f);
		Product p3=new Product(1001,"chair",45,2000.4f);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		Product p4=new Product();
		p4.setPID(1005);
		System.out.println(p4.getpId());

	}

}
