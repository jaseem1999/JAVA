package ajk.methodOverloading;

public class Overloading2 {
// Its main methods overloading Practices 
	public static void main(String[] args) {
		System.out.println("Overloading main methods ");
		main(12);
		main();
	}
	public static void main(int roll) {
		System.out.println("Overloading main methods 2 Roll No: "+ roll);
	}
	public static void main() {
		System.out.println("Overloading main methods without arguments");
	}
	

}
