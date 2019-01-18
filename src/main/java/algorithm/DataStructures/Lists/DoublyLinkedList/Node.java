package algorithm.DataStructures.Lists.DoublyLinkedList;

public class Node<T> {

	private T data;

	private Node<T> prev;

	private Node<T> next;
	
	public Node() {
	}
	
	public Node(T data, Node<T> prev, Node<T> next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrev() {
		return prev;
	}
	
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	
}
