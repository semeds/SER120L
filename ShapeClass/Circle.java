public class Circle extends Shape {
	
	private static final double PI = Math.PI;
	private double radius;

	public Circle(double radius) {
		super(2 * radius, 2 * radius);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius) {
        this.radius = radius;
        super.setHt(2 * radius);
        super.setWd(2 * radius);
    }

	@Override
	public double getArea(){
		double area = Math.PI * radius * radius;
		return area;
	}

	@Override
	public double getPerimeter(){
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
}
