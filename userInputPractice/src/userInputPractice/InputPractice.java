package userInputPractice;

import java.util.Scanner;

public class InputPractice {

	public static void main(String[] args) {
		// playing with user inputs
		 /*
		  * If scanner is underlined red you need to hover over redlines and select import
		  */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Favorite food");
		String favoriteFood = scan.nextLine();
		System.out.println(favoriteFood);

	}

}
