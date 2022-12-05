package L10_Task;

public class Circle extends GeoMetricObject{
	private double radius;
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	Circle(double radius, String color, boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public double getDiameter()
	{
		return 2*radius;
	}
	public double getArear()
	{
		return Math.PI*radius*radius;
	}
	
	public void printCircle()
	{
		System.out.println("Circle [radius=" + radius + "]");
	}
	
	
	

}
