package Lab_2;

import java.util.Scanner;

public class Task_1 { 
	 public static void main(String[] args) {
		int N,value;
		System.out.println("Enter the value of N: ");
		
		Scanner scan = new Scanner(System.in);
		
		N= scan.nextInt();
		int count=1;
		int sum=0;
		while(count<=N)
		{
			System.out.printf("Enter the %d value: ",count);
			value= scan.nextInt();
			sum=sum+value;
			count++;
		}
		
		System.out.println(sum);
		
	}
}
