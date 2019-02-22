package oop;

import java.util.ArrayList;
import java.util.Collection;

public class MergeNames {
    
	private static Collection<String> res = new ArrayList<>();

	public static String[] uniqueNames(String[] names1, String[] names2) {
        
    	for (int i = 0; i < names1.length; i++) {
			for (int j = 0; j < names2.length; j++) {
				if (!names1[i].equals(names2[i])) {
					if (!res.contains(names1[i]) || !res.contains(names2[i])) {
						 res.add(names1[i]);
						 res.add(names2[i]);
					}
				}
			}
		}
    	
    	
    	return res.toArray(new String[res.size()]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia", "Cheikh"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Cheikh"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
