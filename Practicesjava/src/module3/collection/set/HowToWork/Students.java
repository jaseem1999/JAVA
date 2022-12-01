package module3.collection.set.HowToWork;

import java.util.Objects;

public class Students {
	String name;
	int age;
	int mark;
	public Students(String name, int age, int mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return age == other.age && mark == other.mark && Objects.equals(name, other.name);
	}
}
