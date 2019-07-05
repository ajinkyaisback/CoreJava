package CollectionAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo3 {

	public void show(){
	ArrayList<String> ltr = new ArrayList<String>();
	ltr.add("banana");
	ltr.add("apple");
	
	Iterator iterator = ltr.iterator();	
	
	Collections.sort(ltr);
	
	System.out.println(ltr);	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	
	}		
}
