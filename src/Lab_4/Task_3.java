package Lab_4;

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.print("Enter a integer number: ");
		num=scan.nextInt();
		sumDigit(num);
		
	}
	
	public static void sumDigit(int number)
	{
		int rem,sum=0;
		while(number!=0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		
		System.out.println("Sum of digit is: "+sum);
	}
}
