import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

	
		 private static void doStuff(String str) {
		        int var = 3;
		        if (var == str.length()) {
		            System.out.print(str.charAt(--var) + " ");
		        }
		        else {
		            System.out.print(str.charAt(0) + " ");
		        }
		    }
		    public static void main(String args[]) {
//		        doStuff("abcd");
//		        doStuff("efg");
//		        doStuff("hi");
		    	
		    	 String na[] = {"BOB", "A AB C JOHNSON","ANJALI", 
	                       "ASKRIT", "ARMAN MALLIK"}; 
		    	 
		    	 getLargestString(na);
		    }
		    
		    // find the largest character unique of string
		    private static String getLargestString(String[] str) {
		    	
		    	Map<String, Integer> mapValues = new HashMap<>();
		    	Integer max = Integer.MIN_VALUE;
		    	String res = "";
		    	
		    	for (int i = 0; i < str.length; i++) {
					String s = str[i];
					mapValues.put(s, null);
					Set<Character> c = new HashSet<>();
					for (int j = 0; j < s.length(); j++) {
						c.add(s.charAt(j));
						mapValues.put(s, c.size());
					}
				}
		    	
    			max = findMax(mapValues.values().toArray(new Integer[] {}));
    			for(Entry<String, Integer> e : mapValues.entrySet()) {
    				if (e.getValue().equals(max)) {
    					res = e.getKey();
    				}
    			}
    	
		    	System.out.println(res);
		    	
		    	return res;
		    }
		    
		    //find max in integer tab
		    private static Integer findMax(Integer[] tab) {
		    	int max = Integer.MIN_VALUE;
		    	
		    	for (int i = 0; i < tab.length; i++) {
					if (tab[i] > max) {
						max = tab[i];
					}
				}
		    	return max;
		    }

}
