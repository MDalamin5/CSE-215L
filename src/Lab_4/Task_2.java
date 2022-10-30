package Lab_4;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		String value;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter Sterin of NUmber: ");
		value= scan.nextLine();
		
		int flag=0;
		int len = value.length();
		
		for(int i=0; i< len-1 ; i++)
		{
			if(value.charAt(i)!= value.charAt(len-1-i))
			{
				flag= 1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Palendrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}

	}

}
