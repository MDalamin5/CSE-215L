package Lab_9_stack;

public class Test {
	public static void main(String[] args) {
		
		Stack ob = new Stack("Hello");
		ob.push("Hl(");
		
		System.out.println(ob.pop());
		System.out.println(ob.isEmpty());
	}
}
