package abstractTast;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c=new Circle(22);
		System.out.println(c);
		Rectangle r=new Rectangle(34,56);
		System.err.println(r);
		c.display();

	}

}
