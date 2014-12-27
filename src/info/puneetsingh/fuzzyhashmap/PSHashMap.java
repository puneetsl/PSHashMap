package info.puneetsingh.fuzzyhashmap;

import info.puneetsingh.fuzzyhashmap.algos.FuzzyStrings;

import java.util.HashMap;

public class PSHashMap<V>{
	private HashMap<String, V> fuzzyHashMap = new HashMap<String, V>();
	private FuzzyStrings fs;
	
	public PSHashMap(FuzzyStrings fuzzyString) {
		fs = fuzzyString;
	}
	public V get(Object key) {
		return fuzzyHashMap.get(fs.getFuzzyValue(key.toString()));	
	}

	public V put(String key, V value) {
		String transformedKey = fs.getFuzzyValue(String.valueOf(key));
		return fuzzyHashMap.put(transformedKey, value);
	}
	
	
	public boolean containsKey(Object key) {
		return  fuzzyHashMap.containsKey(fs.getFuzzyValue(key.toString()));
	}
}
