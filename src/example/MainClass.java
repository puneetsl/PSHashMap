package example;

import info.puneetsingh.fuzzyhashmap.FHashMap;
import info.puneetsingh.fuzzyhashmap.algos.SameString;
import info.puneetsingh.fuzzyhashmap.algos.SoundexBigram;



public class MainClass {
	
	public static void main(String [ ] args){
		FHashMap<Boolean> shm1 = new FHashMap<Boolean>(new SoundexBigram());
		FHashMap<Boolean> shm2 = new FHashMap<Boolean>(new SameString());
		shm1.put("My name is puneet", true);
		System.out.println(shm1.containsKey("mai naam iz punit"));
		shm2.put("My name is puneet", true);
		System.out.println(shm2.containsKey("mai naam iz punit"));
	}
    

}


