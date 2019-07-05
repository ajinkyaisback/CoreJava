package CollectionAssignment;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Greek");
		treeSet.add("FOr");
		treeSet.add("Jvaava");
		for(String st:treeSet) {
			System.out.println(st);
			System.out.println("\n");
		}
		}
}
