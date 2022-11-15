package Lab_5;

import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of row: ");
		a= scan.nextInt();
		System.out.print("Enter the value of col: ");
		b= scan.nextInt();
		int array[][]= new int [a][b];
		System.out.print("Enter array elements: \n");
		for(int i=0;i<a;i++)
		{
			for (int j = 0; j < b; j++) {
				System.out.printf("Array[%d][%d]= ",i,j);
				array[i][j]=scan.nextInt();
				 
			}
		}
		
		
		
		
		for(int i=0;i<b;i++)
		{
			for (int j = 0; j < a; j++) {
				System.out.print(" "+array[j][i]);
				 
			}
			System.out.println();
		}
		
		
	}

}
