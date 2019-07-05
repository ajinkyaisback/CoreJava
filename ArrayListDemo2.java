package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public void show() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Mayur");
		arrayList.add("Talan");
		arrayList.add("Amravati");
		
//		for(String ab:arrayList) {
//			System.out.println(ab);
//		}
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			
			String yString = iterator.next();
			System.out.println(yString);
		}

		}
	
	
}
