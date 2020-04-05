package com.cacheProject.cache;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//integer & Book
public class Cache<K, V> {

	@Setter
	@Getter
	private int size;

	private ConcurrentHashMap<K, V> cache;
	private LinkedList<K> orderOfData;
	
	public Cache() {
		this.size = 4;
//		this.TableName = name;
		cache = new ConcurrentHashMap<K, V>();
		orderOfData = new LinkedList<>();
	}	
	
	public V get(K key) {
		//check if the value exists for given key in hashmap
		if (cache.containsKey(key)) { 
			V data = cache.get(key);
			
			// Remove the data from LinkedList
			orderOfData.remove(key);
			
			// Add it to the end of the list
			orderOfData.add(key);
			return data;
		}
		return null;
	}
	
	public void set(K key, V value) {
		if (cache.containsKey(key)) {
			
			// Remove old data from linkedlist
			orderOfData.remove(key);
						
			// Update the value in Hashmap
			cache.put(key, value);
			
			// Add new data at the end of the linkedlist
			orderOfData.add(key);
		} else {
			//Data data = new Data(key, value);
			if (cache.size() >= size) {
				cache.remove(orderOfData.getFirst());
				// Remove the oldest value from both map and linkedlist
				orderOfData.pollFirst();
			}
			cache.put(key, value);
			orderOfData.add(key);
		}
	}
}

