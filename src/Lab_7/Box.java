package Lab_7;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	Box()
	{
		width=1.0;
		height=2.0;
		depth=3.0;
	}
	
	Box(double len)
	{
		width=len;
		height=len;
		depth=len;
	}
	Box(double width, double height, double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	Box(Box box )
	{
		width=box.width;
		height=box.height;
		depth=box.depth;
		
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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	
	public void setDim(double width, double height, double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public boolean equalTo(Box o)
	{
		if(width==o.width && height==o.height && depth==o.depth)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public double volume()
	{
		return width*height*depth;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	
	
	

}
