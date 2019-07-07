package JavaBasics;

public class ClassB extends ClassA {

	public ClassB() {
	//super(10);
	//super(30,20);  // super keyword should be written in the child class constructor always 
	// It should be the first statement in any particular constructor 
	{
	}
		 System.out.println("Child Class Constructor");

	}
	
	public ClassB(int i)
	{ 
		super(i);
	
	}
	
	public ClassB(int z , int y)
	{ 
		super(z,y);
	
	}
	
	public static void main(String args[]) {
		
		ClassB Obj =new ClassB(); 
		
		ClassB Obj1 =new ClassB(10);
		
		ClassB Obj3= new ClassB(50,60);
		}
	
}
