package module2.ajk.exceptions.methods;

public class innerMethodExceptions {

	public static void main(String[] args) {
		
		try {
			m1();
		} catch (Exception e) {
			System.out.println("Strat catch");
			System.out.println("Change the b value");
			System.out.println("end catch");
		}
		m2();
		m3();
	}
	public static void m1() {
		System.out.println("m1 start !");
		int s = 10;
		int b = 0;
		int a = s/b;
		System.out.println(a);
		System.out.println("m1 end !");
	}
	public static void m2() {
		System.out.println("m2 start !");
		System.out.println("m2 end !");
	}
	public static void m3() {
		System.out.println("m3 start !");
		System.out.println("m3 end !");
	}

}
