public class Triangle extends Shape {
	
	public Triangle(int ht, int wd) { //width can be the base
		super(ht, wd);
	}

	@Override
	public double getArea(){
		double area = 0.5 * super.getHt() * super.getWd();
		return area;
	}

	@Override 
	public double getPerimeter(){
		double hypotenuse = Math.sqrt(super.getHt() * super.getHt() + super.getWd() * super.getWd());
        return super.getHt() + super.getWd() + hypotenuse;
	}
}
