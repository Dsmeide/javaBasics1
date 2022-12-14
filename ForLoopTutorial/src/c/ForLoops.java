package c;

public class ForLoops {

	public static void main(String[] args) {
		System.out.println("I love dogs");
		
		/*
		 * 3 most common ways to use for loops
		 */
		
		//repeat something over and over again
		
		for(int i = 0; i < 51; i++) {
			System.out.println("I love dogs!");
		}
		
		//repeat iteration over and over again
		
		for(int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		//use in array
		
		int[] grades = {98, 100, 83, 90, 93};
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		String[] favoriteFoods = {"Pizza", "Cookies", "Steak", "Chicken"};
		
		for(int i=0; i <= favoriteFoods.length; i++) {
			System.out.println(favoriteFoods[i]);
		}
	}

}
