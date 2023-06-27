package abstractTast;

public class Circle extends Shape
{
private int radius;
public Circle()
{
	
}

public Circle(int radius) {
	super();
	this.radius = radius;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

@Override
public double getArea() {
	return 3.14*radius*radius;
	
}

@Override
public double getPerimeter() {
	return 2*3.14*radius;
	
}

@Override
public String toString() {
	return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
}


}
