package example;

import info.puneetsingh.fuzzyhashmap.PSHashMap;
import info.puneetsingh.fuzzyhashmap.algos.SameString;
import info.puneetsingh.fuzzyhashmap.algos.SoundexBigram;



public class MainClass {
	
	public static void main(String [ ] args){
		PSHashMap<Boolean> shm1 = new PSHashMap<Boolean>(new SoundexBigram());
		PSHashMap<Boolean> shm2 = new PSHashMap<Boolean>(new SameString());
		shm1.put("thik is Hojpethol", true);
		System.out.println(shm1.containsKey("This is hospitol"));
		shm2.put("My name is puneet", true);
		System.out.println(shm2.containsKey("mai naam iz punit"));
	}
    

}


