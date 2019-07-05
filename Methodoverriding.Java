package OOPConceptPart2;

public class TestCar {
	
	
	//Static Polymorphism or compile-time polymorphism
	
	
	public static void main(String[] args) {
		BMW b =new BMW();
		
		b.start();
		b.stop();
		b.theftsafety();
		b.refuel();
		b.engine();
				
	
		System.out.println("*******************");
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		
		System.out.println("*******************");
		// TOP casting
		Car c1 = new BMW(); //  Child class object can be referred by parent 
		                   // class reference Variable --- dynamic polymorphism --Run Time Polymorphism 
		c1.start();
		c1.stop();
		c1.refuel();
		// DOWN Casting
				BMW b1=(BMW) new Car(); // ClassCastException 
					
		
		
	}
}
