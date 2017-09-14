
public class Rectangle extends Shape {
	private final double a;
	private final double b;

	public Rectangle() {
		this(Shape.DEFAULT_VALUE, Shape.DEFAULT_VALUE);
	}

	public Rectangle(double a, double b) {
		this.a = (a > 0) ? a : Shape.DEFAULT_VALUE;
		this.b = (b > 0) ? b : Shape.DEFAULT_VALUE;
	}

	@Override
	public double area() {
		return a * b;
	}

	@Override
	public double perimeter() {
		return 2 * (a + b);
	}

	@Override
	public String toString() {
		return "\nRectangle:: a = " + this.a + ", b = " + this.b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
}
