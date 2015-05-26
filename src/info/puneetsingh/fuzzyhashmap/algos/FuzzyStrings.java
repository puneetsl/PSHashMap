package info.puneetsingh.fuzzyhashmap.algos;

public abstract class FuzzyStrings {
	/**   
     * Method to get string to find in dictionary
     * @author puneet
	 *
     * @param text as <code>String</code> to find the value in dictionary
     * @return  Fuzzy value as <code>String</code>
     */
	public abstract String getFuzzyValue(String text);
}
