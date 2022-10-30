package Lab_4;

import java.util.Scanner;

public class TaskMethod_2 {

	public static void main(String[] args) {
    String value;
    
   
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter Sterin of NUmber: ");
		value= scan.nextLine();
		
		boolean result = isPalindrome(value);
		if(result==true)
		{
			System.out.println("Palendrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}

	}
	
	public static boolean isPalindrome(String input)
	{
		int len= input.length();
		boolean flag = true;
		
		for(int i = 0; i<len-1; i++)
		{
			if(input.charAt(i) != input.charAt(len-1-i))
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}

}
