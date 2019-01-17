package algorithm.list.linked.singlylinkedlist;

public class SinglyLinkedList<T> {

	private Node<T> head, tail;
	private int size;

	public void insert(T data) {
		this.addLast(data); // or addFirst
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.head);

		if (this.isEmpty()) {
			this.head = this.tail;
		}

		this.head = newNode;
		++this.size;
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(null);

		if (this.isEmpty()) {
			this.head = newNode;
		} else {
			this.tail.setNextNode(newNode);
		}

		this.tail = newNode;
		++this.size;

	}

	public void tranverseList() {

		if (this.head == null) {
			return;
		}

		Node<T> node = this.head;

		while (node != null) {
			System.out.print(node.getData() + " -> ");
			node = node.getNextNode();
		}
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public T removeFirst() {

		if (this.isEmpty()) {
			return null;
		}

		T data = this.head.getData();

		this.head = this.head.getNextNode();

		--this.size;

		if (this.isEmpty()) {
			this.tail = null;
		}

		return data;
	}

	public T first() {
		if (this.isEmpty()) {
			return null;
		}

		return this.head.getData();
	}

	public T Last() {
		if (this.isEmpty()) {
			return null;
		}

		return this.tail.getData();
	}
	
	public int size() {
		return this.size;
	}
}
