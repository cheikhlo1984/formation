package oop;

public class Tableau {

	
	public static void main(String[] args) {
		
		int[][] tab = new int[12][12];
		
		for(int i=0; i<12; i++) {
			for(int j=0; j<12;j++) {
				tab[i][j] = (i+1)*(j+1);
				System.out.print(tab[i][j] + " ");
			}
			 System.out.println();
	      }
	      System.out.println();
		
	}

}
