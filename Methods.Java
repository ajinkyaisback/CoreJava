package OOPConceptPart1;

public class FuntionsinJava {
                                      // main method--> starting point of execution  
	public static void main(String[] args) {
		
		                              //one object will be created ,obj is the reference variable , referring to this object
		                              //after creating the object copy of all non static methods will be given to this methods
		                              //object cannot hold Static methods
		                              // main method is void--> Never returns a value 
		FuntionsinJava obj = new FuntionsinJava();
		obj.test();
		
		int l =obj.pqr();
		System.out.println(l);
		
		
		String s1=obj.qa();
		System.out.println(s1);
		
		int k = obj.division(30, 10);
		System.out.println(k);
	}
                                       // Non static methods
		                               // Void--> does not return any value
		
		      public void test()       //no input , no output
		{
			System.out.println("Test Method");
		}
		                                //return type -->integer 
			  public int pqr()          //No input , some output
			{  
				System.out.println("PQR Method");
			
				int a=10;
				int b=15;
				int c=a+b;
				return c;
			}
			                             // return type --> String
			public String qa()                // No input , some output
			{
				System.out.println("String Method");
				String s ="selenium";
				return s;
			}
			// return type --> int 
			// x,y ---> input parameters /arguments 
			public int  division(int x , int y) {
				
				System.out.println("Division Method");
				int d = x/y;
				return d;
			}
			
		}


