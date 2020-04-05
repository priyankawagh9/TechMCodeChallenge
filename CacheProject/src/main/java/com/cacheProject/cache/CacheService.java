package com.cacheProject.cache;

import java.util.HashMap;

import org.springframework.stereotype.Service;


@Service
public class CacheService<O, K>{
	HashMap<String, Cache> existingCacheList = new HashMap<String, Cache>();
	
	public O getfromCache(String cacheName, K primaryKey) {
		//get cache using cacheName/tableName
		Cache<K, O> cache = getCache(cacheName);
		O object;
		
		//get data using primaryKey from respective cache
		if((object = cache.get(primaryKey))!=null) {
			return object;
		}
		else 
			return null;	
	}

	private <V> Cache<K, V> getCache(String cacheName) {
		Cache<K, V> cache;
		if((cache = existingCacheList.get(cacheName))!=null) {
			return cache; //return existing cache
		}
		else {
			return createCache(cacheName); //create new cache and return it
		}
	}

	private <V> Cache<K, V> createCache(String cacheName){
		Cache<K, V> cache = new Cache<K, V>();
		
		//add new cache into hashmap of cache to avoid recreation of same cache again
		existingCacheList.put(cacheName, cache);
		System.out.println("New Cache created with Name:" + cacheName);
		return cache;
	}

	public void putIntoCache(String cacheName, K primaryKey, O object) {
		Cache<K, O> cache = getCache(cacheName);	
		//add data with primary key into respective cache
		cache.set(primaryKey, object);
	}
	
	
}
