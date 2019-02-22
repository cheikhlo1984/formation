package oop;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		Integer[] array = {1,1,2,3,4,5,6,7,8,8};  //input 1
		Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        
        for (int i = 0; i < array.length; i++) {
        		if (set.add(array[i]) == false) {
            		duplicate.add(array[i]);
            	}
        	}
        
        if (duplicate.size() == 0) {
        	duplicate.add(-1);
        }
        
        for (Integer in : duplicate) {
        	System.out.println(in);
		}
        }
}
