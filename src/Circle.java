
public class Circle extends Shape {
	private final double rad;

	public Circle() {
		this(Shape.DEFAULT_VALUE);
	}

	public Circle(double rad) {
		this.rad = (rad > 0) ? rad : Shape.DEFAULT_VALUE;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(rad, 2);
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * rad;
	}

	@Override
	public String toString() {
		return "\nCircle:: r = " + this.rad;
	}

	public double getRad() {
		return rad;
	}

}
