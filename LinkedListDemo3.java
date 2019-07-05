package CollectionAssignment;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3 {

	public void show() {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(5);
		linkedList.add(67);
		linkedList.add(90);
		linkedList.add(42);
		
		Collections.sort(linkedList);
		System.out.println(linkedList);
//		for(int i = 0; i<linkedList.size();i++) {
//			System.out.println(linkedList.get(i));
//		}
		
	}
}
