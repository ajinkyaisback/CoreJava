package CollectionAssignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo4 {

	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
//		list.add("Greeks");
//		list.add("java");
//		list.add("because");
//		list.add("some");
//
//		List<String> list2 = new LinkedList<>();
//		list2.add("second");
//
//		list.remove(list2);
//		System.out.println(list2);
//		for (String liString : list) {
//			System.out.println(liString);
//			System.out.println();
//		}

//		
//		HashSet<String> hashSet = new HashSet<>();
//		hashSet.add("may");
//		hashSet.add("jun");
//		hashSet.add("may");
//		hashSet.add("july");
//		hashSet.add("jun");
//		hashSet.add("aug");
//		System.out.println(hashSet);
//		
//		
		List<String> list = new LinkedList<>();
		list.add("First");
		list.add("second");
		list.add("First");
		list.add("Thired");
		list.add("second");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			System.out.println();
		}
	
		
	}

}
