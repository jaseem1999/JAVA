package module2.ajk.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	public static void main(String[] args) {
		//Comparator
		String arr[] = {"java","c","python","c++"};
		Arrays.sort(arr, new lenCount());
		for (String string : arr) {
			System.out.println(string);
		}
	}
	//public int compare(Obj arg, obj arg)

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
