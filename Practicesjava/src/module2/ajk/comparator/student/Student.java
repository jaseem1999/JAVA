package module2.ajk.comparator.student;

public class Student implements Comparable {
	String name;
	int id;
	int yop;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yop=" + yop + "]";
	}
	public Student(String name, int id, int yop) {
		super();
		this.name = name;
		this.id = id;
		this.yop = yop;
	}
	@Override
	public int compareTo(Object x) {
		Student c = (Student)x;
		return name.compareTo(c.name);
	}
	
	
}
