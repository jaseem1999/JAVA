package module2.ajk.comparator;

import java.util.Comparator;

public class lenCount implements Comparator{

	@Override
	public int compare(Object x, Object y) {
		
		return ((String)x).length()-((String)y).length();
	}

}
