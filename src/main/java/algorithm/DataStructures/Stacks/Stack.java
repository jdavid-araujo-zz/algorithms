package algorithm.DataStructures.Stacks;

public interface Stack<T> {

	
	void push(T data);

	public T pop();
	
	public T top();
	
	public int size();
	
	public boolean isEmpty();
}
