
package OOPConceptPart1;

public class StaticandNonstaticConcept {
	//global variable :the scope of the global variable will be available across all the functions with some conditions 
	
	
	String name = "Tom"; // Non static global variable 
	static int age =25; // static global variable


	public static void main(String[] args) {
		
		//how to call static method and var?
		//1.direct calling :
		sum();
		
	    // Calling by Classname :
		StaticandNonstaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticandNonstaticConcept.age);
		
		// How to call non static method and vars:
		StaticandNonstaticConcept obj =new StaticandNonstaticConcept();
		obj.Sendmail();
		System.out.println(obj.name);
		
		//Can I access Static Methods using object reference ?YES
		obj.sum(); //waring will be given 
	}
	public void Sendmail() { // Non Static method 
		System.out.println("Send Mail Method");
	}
	
	public  static void sum() {  // Static Method
		System.out.println("Sum Method");
	}
}
