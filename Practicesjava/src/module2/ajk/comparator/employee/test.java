package module2.ajk.comparator.employee;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee arr[]= {new Employee("Adil",0142,540000),
				new Employee("Ram",0156,40000),
				new Employee("jaseem",1132,640000),
				new Employee("arun",0102,340000),
				new Employee("raju",0042,240000),};
		System.out.println("bases is name,id,salay");
		System.out.print("Enter the based shorting");
		String bs = sc.next();
		if (bs.equalsIgnoreCase("name")) {
			Arrays.sort(arr);
		}
		if (bs.equalsIgnoreCase("id")) {
			Arrays.sort(arr,new idEmployee());
		}
		if (bs.equalsIgnoreCase("salay")) {
			Arrays.sort(arr, new salaryEmployee());
		}
		for (Employee employee : arr) {
			System.out.println(employee);
		}
		
	}

}
