package EXP;

public class FinallyBlock {

	public static void main(String[] args) {
		int x=100;
		int y=50, c;
		
		try {
			c=x/y;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("I'm finally block");
		}

	}

}
