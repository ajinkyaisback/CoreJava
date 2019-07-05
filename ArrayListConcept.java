package JavaBasics;

 import java.util.ArrayList;
 
 
public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		
		System.out.println(a.size());
		
		a.add("Hello");
		a.add('M');
		a.add(12.55);
		
		// To print all the values of arraylist  : use for loop 
		for (int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
	
		}
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(100);
		//b.add("String"); Only accept integer value 
		
		ArrayList<String> k = new ArrayList<String>();
		
		k.add("HElloworld");
		//k.add(50); only accept String values 
		//k.add('M');
	 
	}
	
	

}
