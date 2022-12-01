package module3.collection.set.HowToWork;

import java.util.HashSet;
import java.util.Set;

public class tester {

	public static void main(String[] args) {
	
		Set s1 = new HashSet();
		s1.add(new Students("a",21,98));
		s1.add(new Students("jaseem", 23, 99));
		s1.add(new Students("a",21,98));
		System.out.println(s1);

	}

}
