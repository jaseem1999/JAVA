package module3.multlTreading;

public class printNumbers {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread t = new PrintChar();
		t.start();
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("main end");
	}
}
