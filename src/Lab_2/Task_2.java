package Lab_2;

import java.util.Scanner;

public class Task_2 {
   public static void main(String[] args) {
	int num1,num2;
	char oprator;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two number: ");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println("Enter your Operator: ");
	oprator = scan.next().charAt(0);
	
	switch(oprator)
	{
	case '+' :
		System.out.println("Resutl is: "+(num1+num2));
		break;
		
	case '-' :
		System.out.println("Resutl is: "+(num1-num2));
		break;
		
	case '/' :
		System.out.println("Resutl is: "+(num1/num2));
		break;
		
	case '*' :
		System.out.println("Resutl is: "+(num1*num2));
		break;
		
	}
}
}
;