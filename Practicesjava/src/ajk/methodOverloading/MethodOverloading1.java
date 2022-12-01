package ajk.methodOverloading;

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 ov = new MethodOverloading1();
		ov.Overloading(1, "Hp Laptop");
		ov.Overloading(1, 57550.80);
		ov.Overloading(2.101);
	}
	void Overloading(int a, String name) {
		System.out.println("No: "+a);
		System.out.println("Name "+name);
		
	}
	void Overloading(int a, double price ) {
		System.out.println();
		System.out.println("No :"+a);
		System.out.println("Price ="+price);
	}
	void Overloading(double m) {
		System.out.println();
		System.out.println("Model = "+m);
	}
}
