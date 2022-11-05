package com.example.source_dsa.Patterns.Java_Patterns.HallowPatterns;

public class HollowButterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= 5; j++) { // 1st outer loop

			for (int k = 1; k <= j; k++) { // Star Printing - 2nd inner loop
				if(k==1 || k==j )
				System.out.print("*");
				else
				System.out.print("?");
			}

			for (int k = 5; k >= j; k--) { // Spaces
				System.out.print("--");
			}

			for (int k = 1; k <= j; k++) { // Star Printing - 2nd inner loop
				if(k==1 || k==j )
					System.out.print("*");
					else
					System.out.print("?");
			}
			System.out.println();
		}

		for (int j = 1; j <= 4; j++) { // 2nd outer for loop

			for (int k = 4; k >= j; k--) { // Stars printing - 2nd inner for
											// loop
				if(k==4 || k==j)
				System.out.print("*");
				else
				System.out.print(" ");

			}

			for (int k = 0; k <= j; k++) { // Spaces
				System.out.print("  ");
			}

			for (int k = 4; k >= j; k--) { // Star Printing - 2nd inner loop
				if(k==4 || k==j)
				System.out.print("*");
				else
				System.out.print(" ");
			}

			System.out.println();
		}
	}

}
