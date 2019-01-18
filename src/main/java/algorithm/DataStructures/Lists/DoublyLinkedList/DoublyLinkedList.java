package algorithm.DataStructures.Lists.DoublyLinkedList;

public class DoublyLinkedList<T> {

	private Node<T> header, tail;
	private int size;

	public DoublyLinkedList() {
		this.header = new Node<T>(null, null, null);
		this.tail = new Node<T>(null, this.header, null);
		this.header.setNext(tail);
	}

	public void addFirst(T data) {

		this.addData(data, this.header, this.header.getNext());
	}

	private void addData(T data, Node<T> prev, Node<T> next) {
		Node<T> newNode = new Node<T>(data, prev, next);
		prev.setNext(newNode);
		next.setPrev(newNode);
		++this.size;
	}

	public void tranverseList() {
		if (this.isEmpty()) {
			return;
		}

		Node<T> node = this.header.getNext();

		while (node.getNext() != null) {
			System.out.print(node.getData() + " -> ");
			node = node.getNext();
		}
	}

	public int size() {
		return this.size;
	}

	public T first() {
		if (this.isEmpty()) {
			return null;
		}

		return this.header.getNext().getData();
	}

	public T last() {
		if (this.isEmpty()) {
			return null;
		}

		return this.tail.getPrev().getData();
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}
}
