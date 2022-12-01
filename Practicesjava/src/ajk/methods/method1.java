package ajk.methods;
// its simple methods 
//without args
//class name car
public class method1 {

	public static void main(String[] args) {
		method1 car=new method1();// Creation of the object 
		car.mardi();
		System.out.println();
		car.Toyto();
		BMW();//static methods can be called without creating the object   
	}
	//Non-static
	public void mardi() {
		System.out.println("Marudi Shift");
		int price = 800000;
		String  model = "2020 model";
		System.out.println("Price = "+ price);
		System.out.println("model of the car = "+ model);
	}
	// Non-static
	public void Toyto() {
		System.out.println("Toyto Innova");
		int price = 2800000;
		String  model = "2021 model";
		System.out.println("Price = "+ price);
		System.out.println("model of the car = "+ model);
	}
	//Static method
	public static void BMW() {
		System.out.println("BMW");
		int price = 8000000;
		String  model = "2021 model";
		System.out.println("Price = "+ price);
		System.out.println("model of the car = "+ model);
	}


}
