package Lab_8;

public class Line {
	private Point start;
	private Point end;
	Point ob = new Point();
	
	Line(Point start, Point end)
	{
		
		
		
		
	}
	
	Line(int x1, int x2, int y1, int y2)
	{
		x1= ob.getX();
		x2=ob.getX();
		y1=ob.getY();
		y2=ob.getY();
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	double getLength(int x1, int x2, int y1, int y2)
	
	{
		double dx= x2-x1;
		double dy = y2-y1;
		
		double length = Math.sqrt(dx-dy);
		return length;
	}

	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}
	
	
	

}
