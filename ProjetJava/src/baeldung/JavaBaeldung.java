package baeldung;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class JavaBaeldung {

	public static void main(String[] args) {
		
		//System.out.println(getUniqueCharacterSubstring("CODINGISAWESOME"));
		String str = "abbb";
		
		//getAllPermutation(str);
		
		Integer[] input = { 2, 4, 3, 3 };
		int sum = 6;
		//getAllPair(input, sum);
		
		Integer arr[] = {3, 6, 4, 8, 9};
		getSumArrayPuzzle(arr);
	}
	
	public String getUniqueCharacterSubstring(String input) {
		
		String output="";
		for (int start = 0; start < input.length(); start++) {
			Set<Character> visited = new HashSet<>();
			int end = start;
			for(; end < input.length() ; end++) {
				char currChar = input.charAt(end);
				if (visited.contains(currChar)) {
					break;
				}else {
					visited.add(currChar);
				}
			}
			 if (output.length() < end - start + 1) {
		            output = input.substring(start, end);
		     }
		}
		return output;
	}
	
	public String removeRepeteadCharacter(String input) {
		String output = "";
		Set<Character> linkedHashset = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			linkedHashset.add(input.charAt(i));
	   }
		
		for (Character character : linkedHashset) {
			sb.append(character);
		}
		output = sb.toString();
		System.out.println(output);
		return output;
	}
	
	/**
	 * 
	 * @param text
	 * @param word
	 * @return
	 */
	public List<Integer> findWord(String text, String word){
		Set<Integer> indexes = new LinkedHashSet<>();
		text = text.toLowerCase();
		word = word.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			int index = text.indexOf(word, i);
			if (index != -1) {
				indexes.add(index);
			}
		}
		return new ArrayList<>(indexes);
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public List<String> getToken(String str){
		List<String> tokens = new ArrayList<>();
		StringTokenizer tk = new StringTokenizer(str, ",");
		while(tk.hasMoreTokens()) {
			tokens.add(tk.nextToken());
		}
		
		return tokens;
	}
	
	public boolean isAllElementAreTheSame(List<String> list) {
		
		for (String s : list) {
			if(!s.equals(list.get(0))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static List<String> getAllPermutation(String str){
		
		if (str.length() == 0) {
			List<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		char ch = str.charAt(0);
		
		String resStr = str.substring(1);
		
		List<String> prevRes = getAllPermutation(resStr);
		
		List<String> res = new ArrayList<>();
		
		for (String s : prevRes) {
			for (int i = 0; i < s.length(); i++) {
				String f = s.substring(0, i) + ch + s.substring(i);
				
				if (!isPresent(f, res)) {
					res.add(f);
				}
			}
		}
		for (String s : res) {
			System.out.println(s + " , ");
		}
		
		return res;
	}
	
	private static boolean isPresent(String s, List<String> listStr){
		if (listStr.contains(s)) {
			return true;
		}
		return false;
	}
	
	private static Set<Integer[]> getAllPair(Integer[] values, int sum){
		Set<Integer[]> pair = new HashSet<>();
		
		for (int i = 0; i < values.length; i++) {
			for (int j = 1; j < values.length; j++) {
				if(i != j) {
					if(values[i] + values[j] == sum) {
						pair.add(new Integer[] {values[i], values[j]});
				}
				}
			}
		}
		
		for (Integer[] integers : pair) {
			Integer[] tab = integers;
			for (Integer v : tab) {
				System.out.println(v);
			}
			System.out.println(" , ");
		}
		return pair;
	}
	
	
	//Input : arr[] = {3, 6, 4, 8, 9}
	//Output : sum[] = {27, 24, 26, 22, 21}

	//Input : arr[] = {4, 5, 7, 3, 10, 1}
	//Output : sum[] = {26, 25, 23, 27, 20, 29}
	private static Integer[] getSumArrayPuzzle(Integer[] values) {
		
		Integer[] list = new Integer[values.length];
		
		for (int i = 0; i < values.length; i++) {
			int p = values[i];
			int sum=0;
			for (int j = 0; j < values.length; j++) {
				sum = sum + values[j];
			}
			
			list[i] = sum-p;
		}
		
		for (Integer l : list) {
			System.out.println(l);
		}
		
		return list;
	}
}
