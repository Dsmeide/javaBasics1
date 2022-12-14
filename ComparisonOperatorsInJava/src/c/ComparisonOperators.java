package c;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		// == equals
		// <= less than or equal
		// >= greaterthan or equal
		// > greater than	
		// < less than
		// && and
		// || or
		// ! not
		
		double c = 2.4;
		
		if (c == 2.4) {
			System.out.println("they are equal!");
		} else {
			System.out.println("they aren't equal");
		}
		if (c > 7) {
			System.out.println("greater than 7");
		}
		if (a == 2.4 || a == 2.5) {
			System.out.println("either or");
		}
		if (a >= 0 && a <= 100) {
			System.out.println("a is in the range");
		}
		

	}

}
