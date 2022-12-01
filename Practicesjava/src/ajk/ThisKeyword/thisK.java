package ajk.ThisKeyword;
// this keyword are using for the declaring non static variable and method    
public class thisK {
	int a;
	int b;
	public static void main(String[] args) {
		thisK sc = new thisK();
		sc.m1(10,20);
		sc.display();
	}
	public void m1(int a , int b) {
		this.a =a;
		this.b =b;
		d();
	}
	void display() {
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
	static void d() {
		
	}
}
