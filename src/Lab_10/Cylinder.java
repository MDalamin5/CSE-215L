package Lab_10;

public class Cylinder extends Circle{
	
	private double height;
	
	Cylinder()
	{
		height=1.0;
	}
	Cylinder(double height)
	{
		this.height=height;
		
	}
	Cylinder(double height, double radius) {
		//super(radius);
		this.height = height;
		this.setRadius(radius);
		
	}
	
	Cylinder(double height, double radius, String color)
	{
		super(radius,color);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + "Color: "+super.getColor()+"]";
	}
	
	public double getVolume()
	{
		return Math.PI* super.getRadius()*super.getRadius()*height;
	}

}
