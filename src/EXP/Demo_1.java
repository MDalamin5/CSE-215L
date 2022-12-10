package EXP;

public class Demo_1 {
	public static void main(String[] args) {
		int x=10;
		int y=0,c;
		
		
		try {
			c=x/y;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
			//System.out.println(e);
			System.out.println("You can't zero");
		}
		System.out.println("Hello");
	}

}
