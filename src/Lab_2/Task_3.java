package Lab_2;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		n=scan.nextInt();
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2 !=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("+");
				}
				
			}
			System.out.println();
		}
		
	}

}
