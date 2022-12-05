package L10_Task;

public class Rectangle extends GeoMetricObject {

	private double width;
	private double height;
	
	Rectangle()
	{
		
	}
	Rectangle(double width, double height)
	{
		this.width=width;
		this.height=height;
	}
	
	Rectangle(double width, double height, String color, boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.height=height;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}
	public double getDiameter()
	{
		return 0;
	}
	public double getArear()
	{
		return width*height;
	}
	
	public void printRectangle()
	{
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
	}
	
	
	
	
	
	
}
