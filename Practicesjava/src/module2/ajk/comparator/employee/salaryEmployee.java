package module2.ajk.comparator.employee;

import java.util.Comparator;

public class salaryEmployee implements Comparator {

	@Override
	public int compare(Object x, Object y) {
		// TODO Auto-generated method stub
		return ((Employee)y).salay - ((Employee)x).salay;
	}

}
