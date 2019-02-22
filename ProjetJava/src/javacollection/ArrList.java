package javacollection;

import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		
		int n = 5;
		
		ArrayList<Integer> arrayList = new ArrayList<>(n);
		
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		
		System.out.println(arrayList);
		
	    arrayList.remove(3);
	    
	    System.out.println(arrayList);
	}
	
}
