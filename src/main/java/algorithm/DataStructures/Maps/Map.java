package algorithm.DataStructures.Maps;

public interface Map<K,V> {

	int size();
	
	boolean isEmpty();
	
	V get(K key);
	
	V put(K key, V value);
	
	V remove(K key);
}
