package Lab_8;

public class Line {
	private Point start;
	private Point end;
	
	Line(Point start, Point end)
	{
		
	}
	
	Line(int x1, int x2, int y1, int y2)
	{
		
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
	
	double gitLength(int x1, int x2, int y1, int y2)
	
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
