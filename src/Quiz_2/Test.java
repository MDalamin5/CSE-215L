package Quiz_2;

public class Test {
	public static void main(String[] args) {
		
		Point ob1= new Point();
		Point ob2 = new Point(3,4);
		
		Line bc= new Line(ob1,ob2);
		System.out.println(bc.getLength());
		
		
	}
}
