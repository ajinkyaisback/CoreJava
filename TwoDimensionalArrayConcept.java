package JavaBasics;

public class TwoDimensionalArrayConcept {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		//System.out.println(x.length);// 3--- total number of Rows =3
		//System.out.println(x[0].length); //5 -- Total number of colunms =5
		
		
		//1st Row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		//2nd row 
		x[1][0]="M";
		x[1][1]="N";
		x[1][2]="O";
		x[1][3]="P";
		x[1][4]="Q";
		
		//3rd Row
		x[2][0]="K";
		x[2][1]="F";
		x[2][2]="H";
		x[2][3]="J";
		x[2][4]="W";
		
		//System.out.println(x[0][2]);
		 // print all the values of 2d array, use  2 for loop 
	     //  row =0 ,col = 0 to 4  
	     //  row =0 ,col = 0 to 4 
	     //  row =0 ,col = 0 to 4  
		 for (int row=0;row<x.length;row++) {
			 for (int col=0;col<x[0].length;col++) {
				 System.out.println(x[row][col]);
				 
			 }
		 }
		
	}

}
