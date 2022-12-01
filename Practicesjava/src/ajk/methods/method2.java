package ajk.methods;
import java.util.Scanner;
// methods are within arguments
// animals moving 
public class method2 {
	String name;
	public static void main(String[] args) {
		method2 anl = new method2();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter animal name : ");
			anl.move(sc.next());
			System.out.println("Enter animal weight : ");
			anl.weight(sc.nextInt());
		}
	}
	void move(String name) {
		this.name = name;
		System.out.println("Moving "+ name);
	}
	void weight(int weight) {
		System.out.println( name +" Weight " + weight);
	}
}
