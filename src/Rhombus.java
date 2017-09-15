
public class Rhombus extends Shape {

	private final double a;
	private final double angle;

	public Rhombus() {
		this(Shape.DEFAULT_VALUE, Shape.DEFAULT_VALUE);
	}

	public Rhombus(double a, double angle) {
		this.a = (a > 0) ? a : Shape.DEFAULT_VALUE;
		this.angle = (angle > 0 && angle < 90) ? angle : Shape.DEFAULT_VALUE;
	}

	@Override
	public double area() {
		return a * (a * (Math.abs(Math.sin(Math.toRadians(angle)))));
	}

	@Override
	public double perimeter() {
		return 4 * this.a;
	}

	@Override
	public String toString() {
		return "\nRhombus:: a = " + this.a + ", angle = " + this.angle;
	}
}
