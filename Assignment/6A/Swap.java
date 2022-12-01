//Write a java program to swap two numbers without creating third variable
class Swap {
	public static void main(String[] args){
		int a = 10, b = 20;
            System.out.println("Without Swaping : -");
            System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println();
		System.out.println("Swaping a and b without temp veriable : -");
            a = a + b; //a = 30
            b = a - b; //b = 10
            a = a - b; //a = 20
            System.out.println("a = "+ a);
		System.out.println("b = "+ b);	
	}
}