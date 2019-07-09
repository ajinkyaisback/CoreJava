package ProgramsPractice;

public class Pattern6 {

	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3
		 * 1 2
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 6 7
		 * 
		 */

		for (int i = 7; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int k = 1; k <= 7; k++) {
			for (int s = 1; s <= k; s++) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
