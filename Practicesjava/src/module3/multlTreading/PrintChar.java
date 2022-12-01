package module3.multlTreading;

public class PrintChar extends Thread {
	@Override
	public void run() {
		System.out.println("run method of print characters start");
		for (char c='a'; c<='z';c++ ) {
			System.out.println(c);
		}
		System.out.println("run method of print characters end");
		
	}
}
