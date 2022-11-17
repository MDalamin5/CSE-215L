package Lab8_0;

public class Test {

	public static void main(String[] args) {
		Point P_ob= new Point ();
		Point P_ob2= new Point(2,3);
		System.out.println(P_ob);
		
		Line L_ob = new Line(P_ob,P_ob2);
		//Line L_ob2 = new Line(1,2,3,4);
		//System.out.println(L_ob2);
		System.out.println(L_ob.getEnd());
	}
}
