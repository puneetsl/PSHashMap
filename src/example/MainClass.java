package example;

import info.puneetsingh.fuzzyhashmap.PSHashMap;
import info.puneetsingh.fuzzyhashmap.PSHashMap.PRE_HASHING_METHOD;



public class MainClass {
	
	public static void main(String [ ] args){
		PSHashMap phoneBook = new PSHashMap();
		//populate dictionary 
		//for keys that have to be fuzzy search enabled "putFuzzy" method should be used to populate the map
		phoneBook.put("Ralph Smith", "888-123-1234");
		phoneBook.put("Tom Smith", "867-562-1238");
		phoneBook.put("John Doe", "822-156-3768");
		phoneBook.put("Todd Hall", "834-153-5305");
		phoneBook.put("Jane Baker", "859-843-4862");
		


		String searchedNumber = (String)phoneBook.get("Tod Hal");
		System.out.println("Searched number is:" + searchedNumber); 
		searchedNumber = (String)phoneBook.get("Tod Hal", 4);
		System.out.println("Searched number is:" + searchedNumber); 		
	}
    

}


