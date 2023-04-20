public class BbTriangle extends Shape
{
	// assuming this is right-angle triangle
	
	public BbTriangle()
	{
		super(0,0);
	}
	
	public BbTriangle(double height, double base)
	{
		// base is same as width
		super(height, base);
	}
	
	public double getBase()
	{
		// since base is same as width
		return super.getWidth();
	}
	
	@Override
	public double getArea()
	{
		double base = super.getWidth();
		double height = super.getHeight();
		return (base*height)/2;
	}
	
	@Override
	public double getPerimeter()
	{
		double base = super.getWidth();
		double height = super.getHeight();
		// hyp^2 = base^2 + height^2
		double hypotenuse = Math.sqrt(base*base + height*height);
		
		return (base + height + hypotenuse);
	}

	@Override
	public String toString()
	{
		return "Triangle [height=" + super.getHeight() + ", base=" + super.getWidth()+ "]";
	}
	
}