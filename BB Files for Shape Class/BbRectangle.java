public class BbRectangle extends Shape
{
	
	public BbRectangle()
	{
		super(0,0);
	}
	
	public BbRectangle(double height, double width)
	{
		super(height, width);
	}
	
	// no need for any getter/setter since they don't need any modifications. they are available via Shape: reusability
	@Override
	public double getArea()
	{
		return super.getHeight() * super.getWidth();
	}
	
	@Override
	public double getPerimeter()
	{
		return 2 * super.getHeight() + 2 * super.getWidth();
	}

	// toString isn't necessary in this class but for the sake of completion we shall provide one
	@Override
	public String toString()
	{
		return super.toString();
	}
}