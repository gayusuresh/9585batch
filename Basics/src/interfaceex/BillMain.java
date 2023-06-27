package interfaceex;

public class BillMain {

	public static void main(String[] args) {
		EBill e=new EBill(23,100);
		e.billDisplay();
        Bill.display();

		WBill w=new WBill(400,50);
		w.billDisplay();
	}

}
