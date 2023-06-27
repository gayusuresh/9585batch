package polymorphism;

public class OverloaMain {

	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.add(34));
		System.out.println(a.add(33, 22));
		System.out.println(a.add(4.5f,6.7f));

	}

}
