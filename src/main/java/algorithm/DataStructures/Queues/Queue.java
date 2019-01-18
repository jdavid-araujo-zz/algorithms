package algorithm.DataStructures.Queues;

public interface Queue<T> {
	
	void enqueue(T data);
	
	T first();
	
	T dequeue();
		
	int size();
	
	boolean isEmpty();
}
