package Lab_9stack;

public class Test {
	public static void main(String[] args) {
		
		Stack ob = new Stack();
		ob.push(15);
		ob.push(25);
		ob.push(35);
		ob.push(45);
		ob.push(7);
		ob.push(44);
		System.out.println(ob.pop());
		System.out.println(ob.peek());
		ob.show();
		ob.size();
		System.out.println();
		
		//ob.pop();
		System.out.println("\nstack empty: "+ob.isEmpty());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		
	}
}
