package threadex;

public class MultiThreadMain {

	public static void main(String[] args) {
		Table t=new Table();
		FirstThread f=new FirstThread(t);
		SecondThread s=new SecondThread(t);
		f.start();
		s.start();

	}

}
