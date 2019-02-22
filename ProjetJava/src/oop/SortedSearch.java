package oop;

import java.util.ArrayList;
import java.util.List;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        
    	List<Integer> list = new ArrayList<>();
    	for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] < lessThan) {
				list.add(sortedArray[i]);
			}
		}
    	
    	if (list != null && list.size() > 0) {
    		return list.size();
    	}
    	return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 2, 3, 5, 7,8 }, 4));
    }
}