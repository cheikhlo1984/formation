package oop;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] c = word.toCharArray();
        for (int i = 0, j = c.length-1; i < c.length && j>=0; i++, j--) {
				if(c[i] == c[j]) {
		            return true;
			}
		}
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}