package singletonDesign;

public class SingltonMain {

	public static void main(String[] args) {
		SingleObjectDemo s=SingleObjectDemo.getInstance();
		s.showMessage();


	}

}
