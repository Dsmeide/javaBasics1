package c;

public class Logic {

	public static void main(String[] args) {
		// || && !
		
		boolean a = true || true;
		boolean b = true || false;
		boolean c = true && true;
		int d = 3;
		int e = 4;
		boolean f = !(d > e) && true;
		
		boolean isSunny = false;
		boolean amHappy = false;
		
		if((d < e && isSunny) || amHappy) {
			System.out.println("its gonna be a good day!");
		} else {
			System.out.println("its not gonna be a good day!");
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(f);

	}

}
