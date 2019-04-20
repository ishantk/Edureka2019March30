package co.edureka;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		// Add Data
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// (Head) 10 9 8 7 6 5 4 3 2 1 (Tail)
		
		// PriorityQueue shall sort the data automatically
		
		// (Head) 1 2 3 4 5 6 7 8 9 10 (Tail)
		
		// APIs on PriorityQueue
		//System.out.println("Queue size is: "+queue.size());
		//queue.add(10);
		//queue.clear();
		
		//System.out.println(queue.peek()); // Returns Head of Queue | (Head) 1 2 3 4 5 6 7 8 9 10 (Tail)
		//queue.poll(); 					  // Removed Head of Queue | (Head) 2 3 4 5 6 7 8 9 10 (Tail)
		//System.out.println(queue.peek()); // (Head) 2 3 4 5 6 7 8 9 10 (Tail)
		
		// Output for below loop: ?
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.peek());
			queue.poll(); 	//Remove Head and Size shall decrease
		}
		
	}

}
