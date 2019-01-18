package algorithm.DataStructures.Stacks;

import algorithm.DataStructures.Lists.SinglyLinkedList.SinglyLinkedList;

public class StackLinked<T> implements Stack<T> {

	private SinglyLinkedList<T> list = new SinglyLinkedList<T>();
	
	public void push(T data) {
		this.list.addFirst(data);
	}
	
	public T pop() {
		return this.list.removeFirst();
	}
	
	public T top() {
		return this.list.first();
	}
	
	public int size() {
		return this.list.size();
	}
	
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	
}
