package Lab_7;

public class Test {

	public static void main(String[] args) {
		Box box1= new Box();
		//System.out.println(box1.toString());
			System.out.println(box1);
			System.out.println("Volume: "+box1.volume());
			System.out.println();
			
			Box box2 = new Box(5);
			System.out.println(box2);
			System.out.println("Volume: "+box2.volume());
			System.out.println();
			
			Box box3 = new Box(5,6,8);
			System.out.println(box3);
			System.out.println("Volume: "+box3.volume());
			System.out.println();
			
			Box box4 = new Box(box3);
			//Box box4 = new Box(5,6,8);
			System.out.println(box4);
			System.out.println("Volume: "+box4.volume());
			System.out.println();
			System.out.println();
			
			System.out.println("Box1 and Box2 are equal: "+box1.equalTo(box2));
			System.out.println("Box3 and Box4 are equal: "+box3.equalTo(box4));
			
			
			
			
			
			
	}

}
