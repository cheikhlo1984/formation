package oop;

public class Main {

	public static void main(String[] args) {

		System.out.println(" recursion : " + recursion(4));
		
	}
	
	public static int recursion(int num) {
		if (num == 0) {
			return 0;
		}else {
			return 2 + recursion(num - 1);
		}
	}

}
