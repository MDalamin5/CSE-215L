package Lab_8;

public class Test {
	public static void main(String[] args) {
		
		
		Point ob1= new Point();
		
		Point ob2= new Point(3,4);
		
		
		Line obj= new Line();
		System.out.println(obj.getLength(0, 0, 0, 0));
		Line obj2 = new Line(ob2);
		
		
	}

}
