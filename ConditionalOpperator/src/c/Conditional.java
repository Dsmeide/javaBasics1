package c;

public class Conditional {

	public static void main(String[] args) {
		//conditional opperator is basically an if statement in one line
		//values on the right need to match the variable type on the left that it is being stored in
		// is 7 greater than 3? if true: store 7 into a. if false: store 3 into a;
		//int a = (7 > 3) ? 7 : 3;
		int a;
		if(2 > 3) {
			a = 7;
		} else {
			a = 3;
		}
		
		String b = "hello";
		
		double result = b.equals("hello") ? 0.5 : 0.25;
		System.out.println(result);
		
		
		System.out.println(a);
	}

}
