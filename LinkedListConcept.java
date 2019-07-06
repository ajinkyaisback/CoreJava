package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
LinkedList<String> ll = new LinkedList<String>();


  //add 
     ll.add("Jubilee");
     ll.add("English");
     ll.add("High");
     ll.add("School");
     
     // Print 
     System.out.println("Contents of Linked List" + ll);
     
     // addFist()
     ll.addFirst("InAkola");
     
     //addLast()
     
     ll.addLast("NearmyHome");
     
     System.out.println("Contents of Linked List" + ll);
     
     //get
     System.out.println(ll.get(0));
     System.out.println(ll.get(1));
     
     //set
     ll.set(0, "Tom");
     System.out.println(ll.get(0));
     
     //remove
     ll.removeFirst();
     ll.removeLast();
     
     System.out.println("Contents of Linked List" + ll);
     
     ll.remove(2);
     System.out.println("Contents of Linked List" + ll);
     // how to print all values of Linkedlist
     //for loop
     for (int i=0;i<ll.size();i++) {
    	 System.out.println(ll.get(i));
    // advance for loop
    	 
    	 System.out.println("****************Using For LOOP******************************");
    	 
    	 for(String str : ll) {
    		 System.out.println(str);
    	 }
    	 
    	 
    	 System.out.println("*****************Using Itertor*******************************");

    // using Iterator
    	 
    	 Iterator<String> it=ll.iterator();{
    		 while(it.hasNext())
    		 {
    			 System.out.println(it.next());
    		 }
    		 
        	 System.out.println("****************Using While Loop***********************************");
 
    // While Loop
    		 
    		 int num=0;
    		 while(ll.size()>num) {
    			 System.out.println(ll.get(num));
    			 num++;
    		 }
    	 }
    	 
     }
     
     

	}

}
