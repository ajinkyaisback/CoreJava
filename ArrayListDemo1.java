package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {

	public void show() {
	ArrayList<Integer> arrayList =  new ArrayList<>();
	
	arrayList.add(22);
	arrayList.add(54);
	arrayList.add(98);
	
	for(int as:arrayList) {
		
		System.out.println(as);
	}
	
//	for(int i = 0; i<arrayList.size();i++) {
//		System.out.println(arrayList.get(i));
//	}
	
//	Iterator<Integer> iterator = arrayList.iterator();
//	while(iterator.hasNext()) {
//		System.out.println(iterator.next());
//	}
	
//	ListIterator<Integer> listIterator = arrayList.iterator();
//	while(listIterator.hasNext()) {
//		System.out.println(listIterator.next());
//	}
//	System.out.println(arrayList);
	
	}
}
