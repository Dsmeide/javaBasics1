package c;

import java.util.Scanner;

public class BooleanInJava {

	public static void main(String[] args) {
		
		int a = 0;
		boolean b = true;
		boolean c = false;
		boolean d = a == 1;
		
		//booleans are usually used in if() statements
		
		if(b) {
			System.out.println("We are in the if statements!");
		} else {
			System.out.println("We aren't in the if statement");
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
//		String door1 = scan.nextLine();
//		String door2 = scan.nextLine();
		
		if(passedDoor) {
			System.out.println("We Passed door 1");
			doorCount = doorCount + 1;
		} else {
			System.out.println("We missed door 1");
		}
		if(missedDoor) {
			System.out.println("We Passed door 2");
			doorCount = doorCount + 1;
		} else {
			System.out.println("We missed door 2");
		}
		if(passedDoor) {
			System.out.println("We Passed door 2");
			doorCount = doorCount + 1;
		} else {
			System.out.println("We missed door 2");
		}
		if(doorCount == 3) {
			passedAllDoors = true;
		}
		if(passedAllDoors) {
			System.out.println("Congratulations you wont the program!");
		}
		else {
			System.out.println("Sorry, try again");
		}
		
	//trying to turn this boolean game into an input game
		
		
		
}

}
