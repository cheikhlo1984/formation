package oop;

import java.util.Arrays;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
       int[] indice = {};
       
       int indexi;
       int indexj;
       
       for (int i = 0; i < list.length; i++) {
		for (int j = 1; j < list.length; j++) {
			if (sum == list[i] + list[j]) {
				indexi = list[i];
				indexj = list[j];
				indice = addElement(indice, indexi);
				indice = addElement(indice, indexj);
			}
		}
	   }
       
       return indice;
    }

    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    
    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
        	for (int i = 0; i < indices.length; i++) {
        		System.out.println(indices[i]);
			}
            //System.out.println(indices[0] + " and " + indices[1]);
        }
    }
}