package GenDemo;

public class BounGenT {
	
	public static void main(String[] args) {
		
		Integer [] values = {1,2};
		BounGen<Integer> ob = new BounGen<>(values);
		System.out.println(ob.getAvg());
	}

}
