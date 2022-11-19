package Quiz_2;

public class Line {
	private Point start;
	private Point end;
	
	Line(Point start, Point end)
	{
		this.start=start;
		this.end=end;
	}
	
	Line(int x1,int y1, int x2, int y2)
	{
		Point a = new Point(x1,x2);
		Point b = new Point(x2,y2);
		
		start=a;
		end=b;
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
	
	public double getLength()
	{
		double dx = (end.getX()-start.getX())*(end.getX()-start.getX());
		double dy= (end.getY()-start.getY())*(end.getY()-start.getY());
		return Math.sqrt(dx+dy);
	}

	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}
	
	
	
}
