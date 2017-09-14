
public class Rhombus extends Shape {

	private final double a;
	private final double d1;
	private final double d2;

	public Rhombus() {
		this(Shape.DEFAULT_VALUE, Shape.DEFAULT_VALUE, Shape.DEFAULT_VALUE);
	}

	public Rhombus(double a, double d1, double d2) {
		this.a = (a > 0) ? a : Shape.DEFAULT_VALUE;
		this.d1 = (d1 > 0) ? d1 : Shape.DEFAULT_VALUE;
		this.d2 = (d2 > 0) ? d2 : Shape.DEFAULT_VALUE;
	}

	@Override
	public double area() {
		return (this.d1 * this.d2) / 2;
	}

	@Override
	public double perimeter() {
		return 4 * this.a;
	}

	@Override
	public String toString() {
		return "\nRhombus:: a = " + this.a + ", d1 = " + this.d1 + ", d2 = " + this.d2;
	}
}
