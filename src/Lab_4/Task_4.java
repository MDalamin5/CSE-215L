package Lab_4;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your number range: ");
		num1=scan.nextInt();
		num2= scan.nextInt();
		generatePrime(num1,num2);
		

	}
	
	public static void generatePrime(int n1,int n2)
	{
		boolean result;
		for(int i=n1; i<=n2; i++)
		{
			if(i>=2)
			{
				result=isPrime(i);
				
				if(result==true)
				{
					System.out.print(" ,"+i);
				}
			}
			
		}
	}
	
	public static boolean isPrime(int num)
	{
		boolean flag=true;
		
		
			
			for(int i=2; i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
		
		return flag;
	}

}
