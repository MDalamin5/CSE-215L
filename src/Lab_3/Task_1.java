package Lab_3;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		num=scan.nextInt();
		
		switch(num%2)
		{
		case 0:
			
			
				System.out.println("Even");
				break;
			
		case 1:
			
			
				System.out.println("Odd");
				break;
			
			
			
			
		}
		
	}

}
