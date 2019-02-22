package oop;

public class QuickSortExample {

	 public static void main(String[] args)
	    {
		 
		 //10 is missing
	        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
		 
	        int n = 12;
	        int idealSum = (n * (n+1))/2;
	        
	        int sum = calculateSum(numbers);
	        int missing = idealSum-sum;
	        System.out.println("missing number = " + missing);
	        //int a = sum +=sum+1;
	        int b = sum =+sum+1;
	       // System.out.println(" a = " + a);
	       System.out.println(" b = " + b);
		 
	    }

	private static int calculateSum(int[] tab) {

		int sum = 0;
		
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		return sum;
	}
	 
	
	 
	 //Output: [3, 6, 10, 12, 13, 24, 70, 90]
}
