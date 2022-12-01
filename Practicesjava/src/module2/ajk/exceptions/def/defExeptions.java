package module2.ajk.exceptions.def;

public class defExeptions {
// exceptions is the run time thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0;
		int b = 10;
		int c;
		try {
			System.out.println("Enter the try");
			c = b/a;
			System.out.println("Complited the try");
		} catch (Exception e) {
			System.out.println("Enter the catch");
			a =2;
			c = b/a;
			System.out.println("close catch");
		}
		System.out.println(c);
	}

}
