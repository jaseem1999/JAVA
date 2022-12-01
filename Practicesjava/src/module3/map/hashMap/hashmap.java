package module3.map.hashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();//hashMap working hashcode 
		m1.put("java", 23);
		m1.put("c", 20);
		m1.put("c++", 43);
		m1.put("python", 78);
		m1.put("android", 24);
		m1.put("html", 2);
		System.out.println(m1);
		
		LinkedHashMap<String, Integer> m2 = new LinkedHashMap<String, Integer>();//user input 
		m2.put("java", 23);
		m2.put("c", 20);
		m2.put("c++", 43);
		m2.put("python", 78);
		m2.put("android", 24);
		m2.put("html", 2);
		System.out.println(m2);
		
		TreeMap<String, Integer> m3 = new TreeMap<String, Integer>(); //assenting ordering 
		m3.put("java", 23);
		m3.put("c", 20);
		m3.put("c++", 43);
		m3.put("python", 78);
		m3.put("android", 24);
		m3.put("html", 2);
		System.out.println(m3);
		
		Hashtable<String, Integer> m4 = new Hashtable<String, Integer>();// int hashCode () based
		m4.put("java", 23);
		m4.put("c", 20);
		m4.put("c++", 43);
		m4.put("python", 78);
		m4.put("android", 24);
		m4.put("html", 2);
		System.out.println(m4);
	}

}
