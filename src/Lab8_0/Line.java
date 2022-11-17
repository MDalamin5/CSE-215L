package Lab8_0;

public class Line {

	private Point start;
	private Point end;
	
	public Line(Point start,Point end)
	{
		this.start= start;
		this.end= end;
		
	}
	
	public Line(int x1, int y1, int x2, int y2 )
	{
		
		this.start=new Point();
		start.setX(x1);
		start.setY(y1);
		
		this.end=new Point(x2,y2);
		end.setX(x2);
		end.setY(y2);
		
		
		
		
		
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
		int dx= start.getX()-start.getY();
		int dy= start.getX()-start.getY();
		
		
	}

	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}
	
	
	
	
}
