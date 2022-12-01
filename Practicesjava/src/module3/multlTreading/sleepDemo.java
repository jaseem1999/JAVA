package module3.multlTreading;

public class sleepDemo extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		sleepDemo t1 = new sleepDemo();
		sleepDemo t2 = new sleepDemo();
		sleepDemo t3 = new sleepDemo();
		t1.start();
		try {
			t1.join();
		}catch(Exception e){
			
		}
		t2.start();
		t3.start();
	}

}
