package info.puneetsingh.fuzzyhashmap.algos;

public interface FuzzyStrings {
	/**   
     * Method to get string to find in dictionary
     * @author puneet
     * @param string to find the value in dictionary
     * @return  Fuzzy value as <code>String</code>
     */
	public String getFuzzyValue(String text);
}
