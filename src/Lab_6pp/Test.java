package Lab_6pp;

public class Test {

	public static void main(String[] args) {
		
		Account ob = new Account();
		
		System.out.println(ob);
		Account ob1 = new Account(123456,52);
		System.out.println(ob1);
		ob1.caedit(25);
		System.out.println(ob1);
		ob1.debit(25);
		
	}
	
}
