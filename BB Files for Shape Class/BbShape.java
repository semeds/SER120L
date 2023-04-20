public class BbShape
{
	private double height;
	private double width;
	
	public BbShape()
	{
		this(0,0);
	}
	
	public BbShape(double height, double width)
	{
		this.height = height;
		this.width = width;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getArea()
	{
		System.out.println("Inside Shape's getArea, no specific way to find area: 0 would be returned");
		return 0.0;
	}
	
	public double getPerimeter()
	{
		System.out.println("Inside Shape's getPerimeter, no specific way to find perimeter: 0 would be returned");
		return 0.0;
	}

	@Override
	public String toString()
	{
		return "Shape [height=" + height + ", width=" + width + "]";
	}
}