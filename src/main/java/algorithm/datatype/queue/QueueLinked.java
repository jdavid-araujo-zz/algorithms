package algorithm.datatype.queue;

import algorithm.list.linked.singlylinkedlist.SinglyLinkedList;

public class QueueLinked<T> implements Queue<T> {

	SinglyLinkedList<T> list = new SinglyLinkedList<>();
	
	@Override
	public void enqueue(T data) {
		this.list.addLast(data);
	}

	@Override
	public T first() {
		return this.list.first();
	}

	@Override
	public T dequeue() {
		return this.list.removeFirst();
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public boolean isEmpty() {
		return this.isEmpty();
	}

}
