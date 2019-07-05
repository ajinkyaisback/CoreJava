package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array : to store similar datatype values in an array variable 
		
		// Disadvantages of array :
		// 1.Size is fixed -- static array --To overcome this problem we use Collections  --Arraylist,Hashtable --use dynamic array.
		// 2.Stores only similar data types-- to Overcome this problem, we use Object array
		
		
		
		//.1 int array :
		// Lower bound/index=0
		// upper bound /index=n-1 (n is size of array)
		// One dimensional Array
		 int i[] = new int[4];
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40;
		 
				 
				 
		 System.out.println(i[2]);
		 //System.out.println(i[4]); // java.lang.ArrayIndexOutOfBoundsException: 4
		 System.out.println(i.length);
		 // Length/size of an array
		  //Print all the values of array : use for Loop
		 for (int j=0;j<i.length;j++)
		 {
		  System.out.println(i[j]);
		 }
		 //2 . double array
		 double d[] = new double[3];
		 d[0]=10.55;
		 d[1]=11.55;
		 {
		  System.out.println(d[1]+d[0]);
		 }
		 //3. char array 
		 char c[] = new char[4];
		 c[0]='c';
		 c[1]='2';
		 c[3]='S';
		 {
			 System.out.println(c[1]);
			 
		 }
		// 4. boolean array 
		 boolean b[]= new boolean[2];
		 b[1]=true;
		 b[0]= false;
		 
		 //5. String array
		 String s[]=new String[4];
		 s[0]="Hello";
		 s[1]="World";
		 s[2]="Dubai";
		 {
			 System.out.println(s.length);
			 
		 }
		 //6. Object array
		 Object ob[]= new Object[4];
		 ob[0]="Tom";
		 ob[1]=1/1/1992;
		 ob[2]='M';
		 ob[3]="London";
		 
		 { 
			 System.out.println(ob[3]); 
			 System.out.println(ob.length);
		 }
		 
		 
				 
				 
		 }
}