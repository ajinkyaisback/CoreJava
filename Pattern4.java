package ProgramsPractice;

import java.util.Scanner;



public class Pattern4 {
	
	public static void main(String args[]) {

	/**
	 * 1 2 3 4 5 6 7
	 * 1 2 3 4 5 6
	 * 1 2 3 4 5
	 * 1 2 3 4
	 * 1 2 3 
	 * 1 2 
	 * 1
	 */
	
	Scanner scanner = new Scanner(System.in);{
	System.out.println("Enter input data:");	
    int number=scanner.nextInt();

	for(int i=number;i>=1;i--) {
		for (int j=1;j<=i;j++) {
			System.out.print(j+" ");  // for * use Syso("*"+" "):
		}
	System.out.println();
	}
	}
	}
	}
