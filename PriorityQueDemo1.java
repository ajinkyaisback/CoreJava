package CollectionAssignment;

import java.util.PriorityQueue;

public class PriorityQueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(24);
		priorityQueue.add(56);
		priorityQueue.add(96);
		priorityQueue.add(48);
		
		while(priorityQueue.isEmpty() == false) {
			System.out.println("%d remove -> " + priorityQueue.remove() );
			System.out.println("\n");
		}
	}
}
