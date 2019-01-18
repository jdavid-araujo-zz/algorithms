package algorithm.DataStructures.Maps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class HashMap<K, V>  implements Map<K, V> {

	//private List<LinkedList<Entry<K, V>>> buckets = new List<LinkedList<Entry<K,V>>>(); 
	private List[]buckets = new List[100]; 

			
	private int size;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		
		/*Entry<K, V> entry = new Entry<K, V>(key, value);
		LinkedList<Entry<K, V>> list = new LinkedList<Entry<K, V>>();
		int index = 0;
		
		int bucket = key.hashCode() % (this.buckets.size());

		try {
			list = this.buckets.get(bucket);

		} catch (Exception e) {
			list = null;
		}
		
		if(list == null) {
			list = new LinkedList<Entry<K, V>>();
			list.addLast(entry);
			this.buckets.add(bucket, list);
			++this.size;
			
		} else {
			for(Entry<K, V> temp : list ) {
				if(temp.key.equals(key)) {
					list.add(index, entry);
					
					++index;
					
					return temp.value;
				}
			}
				
			list.addLast(entry);
			this.buckets.add(bucket, list);
			++this.size;
			
			return value;
		}*/
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

}
