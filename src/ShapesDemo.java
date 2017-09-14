import java.text.DecimalFormat;

public class ShapesDemo {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("####0.00");

		Shape shape1 = new Rhombus(6, 4.4, 6);
		System.out.println(shape1 + "\nArea = " + df.format(shape1.area()));
		System.out.println("Perimeter = " + df.format(shape1.perimeter()));

		Shape shape2 = new Rectangle(4, 5.32);
		System.out.println(shape2 + "\nArea = " + df.format(shape2.area()));
		System.out.println("Perimeter = " + df.format(shape2.perimeter()));

		Shape shape3 = new Circle(5.3);
		System.out.println(shape3 + "\nArea = " + df.format(shape3.area()));
		System.out.println("Perimeter = " + df.format(shape3.perimeter()));

		Shape shape4 = new Square(7.2);
		System.out.println(shape4 + "\nArea = " + df.format(shape4.area()));
		System.out.println("Perimeter = " + df.format(shape4.perimeter()));
	}
}
