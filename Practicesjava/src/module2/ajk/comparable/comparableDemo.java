package module2.ajk.comparable;

import java.util.Arrays;

public class comparableDemo {

	public static void main(String[] args) {
		//Comparable java.lang
		//public int campareTo(object args)
		//return 0 both are same 
		//its return positive number if current instance is  bigger than given instance
		//its return negative number if current instance is smaller than given instance
		
		String []arr = {"java","php","c","android"};
		Arrays.sort(arr);//Comparable implementation
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
