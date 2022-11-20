package Stack;

public class Test {
	public static void main(String[] args) {
		Stack ob= new Stack();
		ob.push(4);
		ob.push(5);
		ob.push(55);
		ob.push(44);
		System.out.println(ob.pop());
		ob.push(2);
		ob.push(3);
		ob.push(5);
		
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		
		
		
		ob.show();
		
		System.out.println(ob.isEmpty());
	}

}
