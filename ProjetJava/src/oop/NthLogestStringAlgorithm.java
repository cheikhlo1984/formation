package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class NthLogestStringAlgorithm {

	public static void main(String[] args) {

			int n = 1;
	        List<String> list = new ArrayList<>();
	        list.add("Yuri");
	        list.add("Ron");
	        list.add("Interview");
	        list.add("Longest");
	        list.add("List");
	        list.add("Contain");
	          
	        System.out.println(findNthLongestElement(list, n) );
	}

	private static List<String> findNthLongestElement(List<String> list, int n) {
		
		if (list.isEmpty() || n == 0) {
			return null;
		}
		
		TreeMap<Integer, List<String>> map = new TreeMap<>();
		for (String name : list) {
			Integer length = name.length();
			List<String> liste = map.get(length) != null ? map.get(length) : new ArrayList<>();
			liste.add(name);
			map.put(length, liste);
		}
		return map.get(map.descendingKeySet().toArray()[n-1]);
	}

}
