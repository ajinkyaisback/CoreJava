package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		 
		String x = "Hello";
		String y = "World";
		/*System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+x+b+y);
		System.out.println(x+a+y+b);
		System.out.println(a+b+x+y);
		*/
		System.out.println(x+y+(a+b));
		System.out.print("The value of a is :"+a);
		System.out.println("The value of b is :"+b);  //Ln =New Line 
		System.out.println("Addition of a and b:"+(a+b));
	}

}
//+ is concatenation Operator
//println --is used to print on the console with a new line 
//print --is just used to print on the console .
