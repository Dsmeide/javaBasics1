package c;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		int n = scan.nextInt();
		//System.out.println(n);
		
		if(n >= 90 && n <= 100) {
			System.out.println("A");
		} else if (n >= 80 && n <= 89) {
			System.out.println("B");
		} else if (n >= 70 && n <= 79) {
			System.out.println("C");
		} else if (n >= 60 && n <= 69) {
			System.out.println("D");
		} else if (n >= 0 && n <= 59) {
			System.out.println("F");
		} else {
			System.out.println("The number you entered is NOT between 0 and 100");
		}
	}

}
