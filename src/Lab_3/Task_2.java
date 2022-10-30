package Lab_3;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a integer number: ");
		num=scan.nextInt();
		
		int flag=0;
	    for(int i=2; i<=Math.sqrt(num); i++)
	    {
	        if(num%i==0)
	        {
	            flag=1;
	        }
	    }

	    if(flag==0)
	    {
	    	System.out.print("Prime");
	    }
	    else
	    {
	    	System.out.print("Composite");
	    }
		
	}

}
