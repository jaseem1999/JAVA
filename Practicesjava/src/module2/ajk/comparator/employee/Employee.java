package module2.ajk.comparator.employee;

public class Employee implements Comparable {
	String name;
	int id;
	int salay;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salay + "]";
	}
	public Employee(String name, int id, int salay) {
		super();
		this.name = name; 
		this.id = id;
		this.salay = salay;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee s1 =(Employee)o;
		return name.compareTo(s1.name);
	}
	
}
