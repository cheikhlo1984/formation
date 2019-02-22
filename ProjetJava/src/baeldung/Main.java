package baeldung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public boolean checkIfExist(String input) {
		
		String[] tabString = input.split(" ");
		for (String word : tabString) {
			if (word.equals("hello") || word.equals("Baeldung")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param input
	 * @param alphabet
	 * @return
	 */
	private static boolean isPangram(String input, Character[] alphabet) {
		char[] word = input.toCharArray();
		List<Character> liste = new ArrayList<>(alphabet.length);
		for (Character character : alphabet) {
			liste.add(character);
		}
	    for (int i = 0; i < word.length; i++) {
	    	if (word[i] != ' ') {
	    		if (!liste.contains(word[i])) {
					return false;
				}
	    	}
		}
		
		return true;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private static boolean isPangram(String input) {
		
		if (input == null) {
			return false;
		}
		int ALPHABET_COUNT = 26;
		input = input.toUpperCase();
		Boolean[] booleanArray = new Boolean[ALPHABET_COUNT];
		Arrays.fill(booleanArray, false);
		int alphabetIndex = 0;
		for (int i = 0; i < input.length(); i++) 
		{
			if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
				alphabetIndex = input.charAt(i) -'A';
				booleanArray[alphabetIndex] = true;
			}
		}
		
		for (boolean val : booleanArray) {
			if (!val) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private static Set<String> findAllPalindromesUsingBruteForceApproach(String input){
		
		Set<String> palindromes = new HashSet<>();
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j <= input.length(); j++) {
				if (isPalindrome(input.substring(i, j))) {
					palindromes.add(input.substring(i, j));
				}
			}
		}
		
		for (String item : palindromes) {
			System.out.println(item + "  + ");
		}
		
		return palindromes;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private static boolean isPalindrome(String input) {
		StringBuilder builder = new StringBuilder(input);
		StringBuilder reverse = builder.reverse();
		if(input.equals(reverse.toString())){
			return true;
		}
		return false;
	}
}
