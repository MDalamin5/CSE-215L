package Chapter_8;

public class B extends A{
		int total;
		
		B(int a, int b)
		{
			super(a,b);
		}
		
		void show()
		{
			total= super.getX()+super.getB();
			System.out.println(total);
		}
}
