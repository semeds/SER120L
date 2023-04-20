public class ShapeTest {
	public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10); // Generating values for height and width
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());

        Triangle t = new Triangle(4, 3); // Generating values for height and base
        System.out.println("Triangle area: " + t.getArea());
        System.out.println("Triangle perimeter: " + t.getPerimeter());

        Circle c = new Circle(5); // Generating values for radius
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());
    }
}
