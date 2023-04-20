public class Rectangle extends Shape {
	
	public Rectangle(int ht, int wd){
		super(ht, wd);
	}
	
	@Override
	public double getPerimeter(){
		double perimeter = (2 * super.getHt()) + (2 * super.getWd());
		return perimeter;
	}

	@Override 
	public double getArea(){
		double area = super.getHt() * super.getWd();
		return area;
	}
}
