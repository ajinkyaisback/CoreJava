package ListConcept;

public class Employee {
	
	String name ;
	int age ;
	String dept;
 
	
	Employee(String name,int age ,String dept){  // creating constructor , which always have same class name 
		this.name= name;  // use this keyword to initialize global variable when 
		this.age = age;
		this.dept= dept;
		
	}
}
