package module2.ajk.comparator.student;

import java.util.Comparator;

public class youStudent implements Comparator {

	@Override
	public int compare(Object x, Object y) {
		// TODO Auto-generated method stub
		return ((Student)x).yop-((Student)y).yop;
	}

}
