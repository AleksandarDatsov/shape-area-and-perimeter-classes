
public class Square extends Shape {

	private final double a;

	public Square() {
		this(Shape.DEFAULT_VALUE);

	}

	public Square(double a) {
		this.a = (a > 0) ? a : Shape.DEFAULT_VALUE;
	}

	@Override
	public double area() {
		return a * a;
	}

	@Override
	public double perimeter() {
		return 4 * a;
	}

	@Override
	public String toString() {
		return "\nSquare:: a = " + this.a;
	}
}
