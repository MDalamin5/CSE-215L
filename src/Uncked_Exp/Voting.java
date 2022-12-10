package Uncked_Exp;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		
		int age;
		Scanner scan = new Scanner(System.in);
		System.err.print("Enter your age: ");
		age=scan.nextInt();
		
		try
		{
			if(age<18)
			{
				throw new youngAgeEception("You are not eliglable for voting.");
			}
			else 
				System.out.println("voted susfull");
		}
		catch(youngAgeEception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hlelo");
		
	}
}
