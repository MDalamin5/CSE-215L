package Lab_2;

import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		double a,b,c;
		double root1,root2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a, b and c: ");
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		
		double part= (b*b) - (4*a*c);
		
		
		if(part<0)
		{
			double real = -b/(2*a);
			double imaginary= Math.sqrt(-part)/(2*a);
			System.out.format("root1= %.2f + %.2fi",real,imaginary);
			System.out.format("\nroot2= %.2f - %.2fi",real,imaginary);
		}
		
		else if(part>0)
		{
			root1= (-b+ Math.sqrt(part))/(2*a);
			System.out.println(" "+root1);
			root2= (-b- Math.sqrt(part))/(2*a);
			System.out.println(" "+root2);
		}
		
		else
		{
			System.out.println("Invalid input");
		}
		
		
		
		
	}
}
