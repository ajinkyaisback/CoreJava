package TestPackage;

public class FinallyConcept {
	

	public static void main(String[] args) {
		//test1();
		//test2();
		division();
	} 
	
	public  static void test1() {
		
		try {
			System.out.println("Inside Test1 Method");
		throw new RuntimeException("test"); 
		}catch(Exception e) {
			System.out.println("Inside Catch Block");
		}
		finally {
			System.out.println("Inside finally block "); // finally is always used with try catch block , it will always executed after try catch block
		}
	}
		public static void test2() {
		 try {
			System.out.println("Inside test2 Method ");
		}
		finally {
			System.out.println("finally code in test2 method ");
		}
	}
		
		public static void division() {
			int i=10;
			
			try {
				System.out.println("Inside try Block");
				 int k=i/0;
			}
			catch(ArithmeticException e) {    // (NullPointerExcception e)--  
				System.out.println("Inside Catch Block");
				System.out.println("divide by zero error");
			}
			finally {
				System.out.println("Execute this Code even after Exception ");
			}
		}
}

