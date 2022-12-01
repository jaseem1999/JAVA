package module2.ajk.comparator.student;

import java.util.Comparator;

public class idStudent implements Comparator {

	@Override
	public int compare(Object x, Object y) {
		
		return ((Student)x).id-((Student)y).id;
	}
	
}
