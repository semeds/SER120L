public class BbCircle extends BbShape
{
	// assuming that any circle's width and height are equal
	// assuming height/width is the diameter of the circle
	public BbCircle()
	{
		super(0,0);
	}
	
	public BbCircle(double radius)
	{
		// assuming height is same as width, and each of them represents diameter
		super(radius*2, radius*2);
	}
	
	@Override
	public double getArea()
	{
		double radius = super.getWidth()/2;
		return Math.PI * Math.pow(radius,2);
	}
	
	@Override
	public double getPerimeter()
	{
		double radius = super.getWidth()/2;
		return 2 * Math.PI * radius;	
	}

	@Override
	public String toString()
	{
		double radius = super.getHeight()/2;
		return "Circle [radius=" + radius + "]";
	}
	
	
}