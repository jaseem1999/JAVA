package ajk.Constructors;

public class Employee {
	String name;
	int id;
	String desgination; 
	String salary;
	public static void main(String[] args) {
		Employee e =new Employee("Adil",1432,"CEO","250MUID");
		e.display();
	}
	void display() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee id No : "+id);
		System.out.println("Employee Posision : "+desgination);
		System.out.println("Employee Salary Per anna : "+salary);
	}
	Employee(String n, int i, String d, String s) {
		name =n;
		id =i;
		desgination =d; 
		salary =s;
	}
}
