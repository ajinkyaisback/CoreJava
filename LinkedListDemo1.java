package CollectionAssignment;

import java.util.Iterator;
//import java.util.LinkedList;
import java.util.LinkedList;


public class LinkedListDemo1 {

	public void show() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(5);
		linkedList.add(4);
		linkedList.add(2);	
		System.out.println(linkedList.getFirst());
		Iterator<Integer> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
