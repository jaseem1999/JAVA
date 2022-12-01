package module2.ajk.assignment;

public class AlphaNumarc {

	public static void main(String[] args) {
		// String
		String s = "75#41*";
		//for loop check
		int flag = 0;
		for (int i = 0; i < s.length(); i++) {
			int demo = (int) s.charAt(i);
			if (!(demo >= 49 && demo <= 57)) {
				flag =1;
			}
		}
		if (flag == 1) {
			System.out.println("alpha = "+s);
			s = s.replaceAll("[^\\d]", " "); 
	        // Remove spaces in first character and end
	        s = s.trim();
	        // Replace all spaces 
	        s = s.replaceAll(" ", "");
	        System.out.println("repalce = "+s);//out put 75#41* --> 7541 
		} else {
			System.out.println("No alpha Numaric "+ s);
		}
		
		
	}

}
