package module2.ajk.comparator.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student arr[]= {new Student("adil", 4401, 2022),
						new Student("nazi", 4411, 2023),
						new Student("raheem", 4501, 2012),
						new Student("sanju", 4441, 2014),
						new Student("lal", 4001, 2021)};
		System.out.println("Sorting bassed on = ");
		String bs = sc.next();
		if (bs.equalsIgnoreCase("name")) {
			Arrays.sort(arr);
		}
		if (bs.equalsIgnoreCase("id")) {
			Arrays.sort(arr, new idStudent());
		}
		if (bs.equalsIgnoreCase("yop")) {
			Arrays.sort(arr, new youStudent());
		}
		for (Student student : arr) {
			System.out.println(student);
		}
	}

}
