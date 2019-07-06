package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
      int a[] = new int[3];  // Static Array --size is fixed.
      
      // Dynamic array-- ArrayList
      
      //1. Contain Duplicate Values/elements
      //2. Maintain insertion Order
      //3. Synchronized
      //4. Allows random access to fetch element because it stores the values on the basis of indexes 
      
      ArrayList b = new ArrayList();
      
      b.add(10); //0
      b.add(20); //1
      b.add(15); //2
      System.out.println(b.size()); // Size of array
      System.out.println(b.get(2)); // to get the value from the index
      
      b.add(30);
      b.add(25);
      b.add(10);
      b.add("String");
      b.add('X');
      b.add(true);
      System.out.println(b.size());
      
      
  // To print all the values of arraylist : 
      //  1. for Loop
      //  2. using iterator 
      
       for (int i=0;i<b.size();i++)
       {
    	   System.out.println(b.get(i));
       }
       //generic vs nongeneric 
       
       ArrayList<Integer> b1 = new ArrayList<Integer>();
       
       b1.add(100);
       //b1.add("Selenium"); Only Integer Values Accepted
       
       ArrayList<String> c = new ArrayList<String>();
       
       c.add("HelloWorld");
       //c.add(100);
       
       //ArrayList<E> x = new ArrayList<E>();
       
       // Employee class Objects
       
       Employee a1 = new Employee("Naveen",27,"QA");
       Employee a2 = new Employee("Rajesh",28,"BusinessAnalyst");
       Employee a3 = new Employee("Siddhant",29,"Development");	  
    
       //Create ArrayList:
       
       ArrayList ar =new ArrayList();
       
       ar.add(a1);
       ar.add(a2);
       ar.add(a3);
       
       
       
       //iterator to traverse the values 
       
       Iterator<Employee> it =ar.iterator(); // If you want to use all the values of the arraylist  use iterator method  
       while(it.hasNext()) {                // Iterator does not work on the  basis of indexes while using for loop  
    	   Employee emp = it.next();
    	   System.out.println(emp.name);
    	   System.out.println(emp.age);
    	   System.out.println(emp.dept);
    	     
       }
       //***********************************************************************
       //addAll()
       
       
ArrayList<String> c4 = new ArrayList<String>();
       
       c4.add("HelloWorld");
       c4.add("Selenium");
       c4.add("Misty");
       
       ArrayList<String> c5 = new ArrayList<String>();
       
       c5.add("Pepsico");
       c5.add("Hindustan");
       c5.add("World Heritagesites");
       
       c4.addAll(c5);
       
        for (int i=0; i<c4.size();i++) {
        	System.out.println(c4.get(i));
        	
        }
        
     
        // removeAll()
        c4.removeAll(c5);
        
        for (int i=0; i<c4.size();i++) {
        	System.out.println(c4.get(i));
        	
	}
        // retainAll()
        
        ArrayList<String> c6 = new ArrayList<String>();
        
        c6.add("HelloWorld");
        c6.add("Selenium");
        c6.add("Misty");
        
        ArrayList<String> c7 = new ArrayList<String>();
        
        c7.add("Pepsico");
        c7.add("Selenium");
        c7.add("World Heritagesites");
		
        c6.retainAll(c7);
        
        System.out.println("****************************************");
        
        for (int i=0; i<c6.size();i++) {
        	System.out.println(c6.get(i));
        
	}
        }
	}



