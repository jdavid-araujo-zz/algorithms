package algorithm.list;

public class ArrayList<T> {

	private final static int LENGTH = 15;
	
	private T[] data;
	
	private int size = 0;
	
	public ArrayList() {
		this(LENGTH);
	}
	
	public ArrayList(int length) {
		this.data = (T[]) new Object[length];
	}
	
	public int size() {
		return this.size;
	}
	
	public T get(int index) {
		return this.data[index];
	}
	
	public void add(T data) {
		
		if(this.data.length == this.size) {
			resize(2 * LENGTH);
		}
		
		this.data[this.size] = data;
		this.size++;
	}
	
	public T set(int index, T data) {
		this.chechLimit(index, this.size + 1);

		T element = this.data[index];
		this.data[index] = data;
		
		return element;
	}
	
	public T remove(int index) {
		this.chechLimit(index, this.size );

		T data = this.data[index];
		
		for(int i= index; i < (this.size + 1); i++) {
			this.data[i] = this.data[i+1];
		}
		
		this.data[this.size - 1] = null;
		
		--this.size;
		
		return data;
	}
	
	private void chechLimit(int i, int j) {
		if((i < 0) || (i >= j )) {
			throw new IndexOutOfBoundsException("Error");
		}
	}
	
	private void resize(int length) {
		T[] aux = (T[])new Object[length];
		
		for(int i = 0; i < this.size; i++) {
			aux[i] = this.data[i];
		}
		
		this.data = aux;
	}
}
