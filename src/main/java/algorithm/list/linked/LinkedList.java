package algorithm.list.linked;

public class LinkedList<T> {

	private Node<T> root;
	
	public void insert(T data) {
		
		if(this.root == null) {
			this.root = new Node<T>(data);
		} else {
			this.addDataAtHead(data);
		}
	}
	
	private void addDataAtHead(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.root);
		this.root = newNode;
	}
	
	public void tranverseList() {
		
		if(this.root == null) {
			return;
		}
		
		Node<T> node = this.root;
		
		while(node != null) {			
			
			System.out.print(node.getData() + " -> ");
			
			node = node.getNextNode();
		}
	}
}
