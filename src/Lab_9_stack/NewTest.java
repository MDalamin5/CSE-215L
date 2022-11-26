package Lab_9_stack;

import java.util.Scanner;

public class NewTest {
	
	public static void main(String[] args) {
		DelimiterMatching ob = new DelimiterMatching();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Expresion :");
		String s = input.nextLine();
		boolean result = ob.isDelimiterMactching(s);
		System.out.println(result);
	}

}
