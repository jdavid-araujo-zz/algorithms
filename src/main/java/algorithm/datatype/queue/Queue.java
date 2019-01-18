package algorithm.datatype.queue;

public interface Queue<T> {
	
	void enqueue(T data);
	
	T first();
	
	T dequeue();
		
	int size();
	
	boolean isEmpty();
}
