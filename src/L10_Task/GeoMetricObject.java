package L10_Task;

public class GeoMetricObject {
	private String color;
	private boolean filled;
	
	GeoMetricObject()
	{
		
	}
	
	GeoMetricObject(String color, boolean filled)
	
	{
		this.color=color;
		this.filled=filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "GeoMetricObject [color=" + color + ", filled=" + filled + "]";
	}
	
	
	

}
