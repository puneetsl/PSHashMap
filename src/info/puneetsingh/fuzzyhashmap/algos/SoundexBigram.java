package info.puneetsingh.fuzzyhashmap.algos;

public class SoundexBigram implements FuzzyStrings{

	@Override

	public String getFuzzyValue(String text) {
		String transformedKey = "";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length-1; i++) {
			transformedKey += soundexWord(words[i]+ " "+ words[i+1]);
		}
		return transformedKey;
	}
	private String soundexWord(String text)
	{
		char[] x = text.toUpperCase().toCharArray();
		char firstLetter = x[0];

		// convert letters to numeric code
		for (int i = 0; i < x.length; i++) {
			switch (x[i]) {
			case 'B':
			case 'F':
			case 'P':
			case 'V': {
				x[i] = '1';
				break;
			}

			case 'C':
			case 'G':
			case 'J':
			case 'K':
			case 'Q':
			case 'S':
			case 'X':
			case 'Z': {
				x[i] = '2';
				break;
			}

			case 'D':
			case 'T': {
				x[i] = '3';
				break;
			}

			case 'L': {
				x[i] = '4';
				break;
			}

			case 'M':
			case 'N': {
				x[i] = '5';
				break;
			}

			case 'R': {
				x[i] = '6';
				break;
			}

			default: {
				x[i] = '0';
				break;
			}
			}
		}

		// remove duplicates
		String output = "" + firstLetter;
		for (int i = 1; i < x.length; i++)
			if (x[i] != x[i - 1] && x[i] != '0')
				output += x[i];

		// pad with 0's or truncate
		output = output + "0000";
		return output.substring(0, 4);
	}

}
