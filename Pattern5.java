package ProgramsPractice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		/*
		 * 7 6 5 4 3 2 1 
		 * 7 6 5 4 3 2 7 
		 * 6 5 4 3 
		 * 7 6 5 4 
		 * 7 6 5 
		 * 7 6 
		 * 7
		 */
		System.out.println("Enter Input Data:");
		Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			for (int i = 1; i <= number; i++) {
				for (int j =number; j>=i; j--) {
					System.out.print(j+" ");
				}System.out.println();

			}
			
		}

	}

