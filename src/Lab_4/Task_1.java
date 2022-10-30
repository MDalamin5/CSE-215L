package Lab_4;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter a string : ");
		input=scan.nextLine();
		checkVoiwel(input);
		
		
		
	}
	
	
		public static void checkVoiwel(String stetment)
		{
			
			int count=0;
			
			
			for(int i=0; i< stetment.length(); i++)
				
			{
				
				if(stetment.charAt(i)==('a'))
				{
					count++;
				}
				else if(stetment.charAt(i)==('e'))
				{
					count++;
				}
				else if(stetment.charAt(i)==('i'))
				{
					count++;
				}
				else if(stetment.charAt(i)==('o'))
				{
					count++;
				}
				else if(stetment.charAt(i)==('u'))
				{
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
		
		
		
}
