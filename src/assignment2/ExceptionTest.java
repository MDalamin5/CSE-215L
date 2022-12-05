package assignment2;

import java.util.Scanner;

public class ExceptionTest {
	
	static void check(int marks) throws Exception {
		if (marks >= 100 || marks <= 0)
			throw new Exception(marks);
		
		else {
			System.out.println("Marks obtained: "+marks+" Result: ");
			
			if (marks>=50) System.out.println("Passed");
			else 
				System.out.println("Failed");
		}
	}

	public static void main(String[] args) {
		
		int i,marks;
		Scanner inp = new Scanner(System.in);
		for(i=0;i<5;i++){
		marks = inp.nextInt();
		try{
		check(marks); }catch(Exception e){
		System.out.println("Exception Caught: "+e); }
		}
		inp.close();

	}

}
